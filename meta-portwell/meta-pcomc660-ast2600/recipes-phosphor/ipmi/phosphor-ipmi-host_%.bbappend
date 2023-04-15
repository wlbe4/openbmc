DEPENDS_append_pcomc660-ast2600= " pcomc660-ast2600-yaml-config"

EXTRA_OECONF_pcomc660-ast2600 = " \
    SENSOR_YAML_GEN=${STAGING_DIR_HOST}${datadir}/pcomc660-ast2600-yaml-config/ipmi-sensors.yaml \
    FRU_YAML_GEN=${STAGING_DIR_HOST}${datadir}/pcomc660-ast2600-yaml-config/ipmi-fru-read.yaml \
    "

EXTRA_OECONF_append_pcomc660-ast2600 = " --disable-i2c-whitelist-check"
EXTRA_OECONF_append_pcomc660-ast2600 = " --disable-ipmi-whitelist"
