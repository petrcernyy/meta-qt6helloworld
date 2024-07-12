SUMMARY = "QT QML Test Recipe"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "file://CMakeLists.txt  \
           file://main.cpp  \
           "

DEPENDS += "qtbase wayland"

S = "${WORKDIR}"

inherit cmake
inherit qt6-cmake
