ALT_RMCPP_IFACE  = "eth1"
SYSTEMD_SERVICE_${PN}_append += " \
    ${PN}@${ALT_RMCPP_IFACE}.service \
    ${PN}@${ALT_RMCPP_IFACE}.socket \
    "

