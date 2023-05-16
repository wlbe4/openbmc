SUMMARY = "Phosphor Time Manager daemon"
DESCRIPTION = "Daemon to cater to BMC and HOST time management"
HOMEPAGE = "http://github.com/openbmc/phosphor-time-manager"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
DEPENDS += "systemd"
DEPENDS += "sdbusplus"
DEPENDS += "${PYTHON_PN}-sdbus++-native"
DEPENDS += "phosphor-logging"
DEPENDS += "phosphor-dbus-interfaces"
SRCREV = "ea220361b8da915b093a98aa3ad19061b6c2ef88"
PV = "1.0+git${SRCPV}"
PR = "r1"

SRC_URI = "git://github.com/openbmc/phosphor-time-manager;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit meson pkgconfig python3native
inherit obmc-phosphor-dbus-service

RDEPENDS:${PN} += "phosphor-settings-manager"
RDEPENDS:${PN} += "phosphor-network"
RDEPENDS:${PN} += "phosphor-objmgr"

DBUS_SERVICE:${PN} += "xyz.openbmc_project.Time.Manager.service"
