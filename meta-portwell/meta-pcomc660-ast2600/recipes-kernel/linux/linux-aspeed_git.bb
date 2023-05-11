KBRANCH ?= "dev-6.1"
LINUX_VERSION ?= "6.1.15"

SRCREV="580639a973406691fa93b8fa377c4c5a43f66094"

SRC_URI:append = " file://0001-pcomc660-ast2600.patch"

require linux-aspeed.inc
