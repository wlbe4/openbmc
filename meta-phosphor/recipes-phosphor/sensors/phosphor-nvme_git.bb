SUMMARY = "NVMe Drive Manager"
DESCRIPTION = "Daemon to monitor and report the status of NVMe drives"
HOMEPAGE = "https://github.com/openbmc/phosphor-nvme"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS += "sdbusplus"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "sdeventplus"
DEPENDS += "phosphor-logging"
DEPENDS += "nlohmann-json"
SRCREV = "7da98588dc04f55ce03599dbfd16fd3c072f5955"
PR = "r1"

SRC_URI = "git://github.com/openbmc/phosphor-nvme.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
SYSTEMD_SERVICE:${PN} = "xyz.openbmc_project.nvme.manager.service"

inherit meson pkgconfig
inherit systemd
