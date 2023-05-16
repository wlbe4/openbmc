SUMMARY = "libnvme with examples"
DESCRIPTION = "NVMe library implementation"
HOMEPAGE = "https://github.com/linux-nvme/libnvme"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"
DEPENDS += "pkgconf "
DEPENDS += "ninja-native "

SRCREV = "f7ba8bf447d44ac6b58fa0e41e58967754881897"
#PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} pcap"
#PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir}, \
#                          --without-systemdsystemunitdir,systemd"
#PACKAGECONFIG[astlpc-raw-kcs] = "--enable-astlpc-raw-kcs,--disable-astlpc-raw-kcs,udev,udev"
#PACKAGECONFIG[pcap] = "--enable-capture,--disable-capture,libpcap,"
PV = "1.0+git${SRCPV}"
PR = "r1"

SRC_URI = "git://github.com/linux-nvme/libnvme;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit systemd
inherit autotools pkgconfig
inherit meson gettext deploy

EXTRA_OEMESON = "-Dpython=disabled -Ddocs-build=false"

do_install:append() {
        install -D -m 0755 ${WORKDIR}/build/examples/mi-mctp ${D}/usr/bin
}

