FILESEXTRAPATHS_prepend_pcomc660-ast2600 := "${THISDIR}/${PN}:"
PACKAGECONFIG_append_pcomc660-ast2600 = " associations"
SRC_URI_append_pcomc660-ast2600 = " file://associations.json"
DEPENDS_append_pcomc660-ast2600 = " inventory-cleanup"

do_install_append_pcomc660-ast2600() {
    install -d ${D}${base_datadir}
    install -m 0755 ${WORKDIR}/associations.json ${D}${base_datadir}/associations.json
}
