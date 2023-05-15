FILESEXTRAPATHS:append:pcomc660-ast2600 := "${THISDIR}/${PN}:"
KBRANCH ?= "dev-6.1"
LINUX_VERSION ?= "6.1.15"

SRCREV="288cdbcca137444c131180738a8046c93ae228f0"

SRC_URI:append:pcomc660-ast2600 = " file://0001-pcomc660-ast2600.patch"
SRC_URI:append:pcomc660-ast2600 = " file://0002-Fix-PWM-driver.patch"
SRC_URI:append:pcomc660-ast2600 = " file://pcomc660-ast2600.cfg"