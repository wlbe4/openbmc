KBRANCH ?= "dev-5.10"
LINUX_VERSION ?= "5.10.67"

SRCREV="cf06e1ab1c3ed354da5873e646f2164fea147c88"

SRC_URI_append = " file://0001-2021-11-18-Add-Pcom-C660-AST2600-support.patch"
SRC_URI_append = " file://0002-2021-11-22-Modify-the-filesystem-partitions-setting-.patch"
require linux-aspeed.inc
