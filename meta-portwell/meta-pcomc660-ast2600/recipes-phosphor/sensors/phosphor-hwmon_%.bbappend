FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

EXTRA_OECONF:append:pcomc660-ast2600 = " --enable-negative-errno-on-fail"

CHIPS = " \
        bus@1e78a000/i2c-bus@380/tmp421@4e \
        bus@1e78a000/i2c-bus@380/tmp421@4f \
        pwm-tacho-controller@1e610000 \
        "
ITEMSFMT = "ahb/apb/{0}.conf"

ITEMS = "${@compose_list(d, 'ITEMSFMT', 'CHIPS')}"
ITEMS += "iio-hwmon.conf"

ENVS = "obmc/hwmon/{0}"
SYSTEMD_ENVIRONMENT_FILE_${PN}:append:pcomc660-ast2600 = " ${@compose_list(d, 'ENVS', 'ITEMS')}"
