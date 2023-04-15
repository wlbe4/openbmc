FILESEXTRAPATHS:prepend:pcomc660-ast2600 := "${THISDIR}/${PN}:"
PACKAGECONFIG:append:pcomc660-ast2600 = " associations"
SRC_URI:append:pcomc660-ast2600 = " file://associations.json"
DEPENDS:append:pcomc660-ast2600 = " inventory-cleanup"

do_install:append:pcomc660-ast2600() {
    install -d ${D}${base_datadir}
    install -m 0755 ${WORKDIR}/associations.json ${D}${base_datadir}/associations.json
}
