# Machine specific configurations

MACHINE_TFM_REQUIRE ?= ""
MACHINE_TFM_REQUIRE:corstone1000 = "trusted-firmware-m-1.7.0-corstone1000.inc"

require ${MACHINE_TFM_REQUIRE}

COMPATIBLE_MACHINE:tc = "(tc1)"
TFM_PLATFORM:tc = "arm/rss/tc"
