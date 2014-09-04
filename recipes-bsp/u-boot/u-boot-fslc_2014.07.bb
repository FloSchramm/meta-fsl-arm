include u-boot-fslc.inc

PV = "v2014.07"

SRCREV = "e36968af0a033e9d66535928886103370620cb4d"
SRCBRANCH = "patches-2014.07"

#fix to integrate to use with 3.10.31 kernel
SRC_URI += "file://iMX6-Change-mmcroot-to-use-fixed-mmc-block-index-for.patch"
