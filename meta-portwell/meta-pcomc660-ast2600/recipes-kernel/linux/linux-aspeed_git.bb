KBRANCH ?= "dev-6.1"
LINUX_VERSION ?= "6.1.15"

SRCREV="580639a973406691fa93b8fa377c4c5a43f66094"

SRC_URI:append = " file://0001-2021-11-18-Add-Pcom-C660-AST2600-support.patch"
SRC_URI:append = " file://0002-2021-11-22-Modify-the-filesystem-partitions-setting-.patch"
require linux-aspeed.inc
