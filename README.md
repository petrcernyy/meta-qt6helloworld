# meta-qt6helloworld

Yocto recipe for simple Qt 6.5 console application printing Hello world. Qt apllication is build using cmake. Yocto branch is Dunfell.

This layer depends on layers meta-openembedded/meta-oe, meta-openembedded/meta-python

`git clone -b dunfell git://git.openembedded.org/meta-openembedded`
 
and meta-qt6

`git clone -b 6.5 http://code.qt.io/yocto/meta-qt6.git`

Include this line in conf/local.conf

`IMAGE_INSTALL_append = " helloworld"

