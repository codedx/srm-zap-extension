[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![CodeQL](https://github.com/zaproxy/zap-extensions/actions/workflows/codeql.yml/badge.svg)](https://github.com/zaproxy/zap-extensions/actions/workflows/codeql.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=zaproxy_zap-extensions&metric=alert_status)](https://sonarcloud.io/dashboard?id=zaproxy_zap-extensions)

This project contains add-ons for the [Zed Attack Proxy](https://github.com/zaproxy/zaproxy) (ZAP).

If you are using the latest version of ZAP, you can browse and download "Software Risk Manager Extension" directly from within ZAP by clicking the Marketplace button in the toolbar.
This specific add-on is Software Risk Manager (SRM), and you can find it in the Marketplace under the name “Software Risk Manager Extension”.

![Image](https://github.com/zaproxy/zap-extensions/wiki/images/zap-screenshot-browse-addons.png)

You can also import add-ons you have downloaded manually from https://github.com/zaproxy/zap-extensions/releases via the "File / Load Add-on File..." menu option.

Please see the [wiki](https://github.com/zaproxy/zap-extensions/wiki) for more details.

## Building

The add-ons are built with [Gradle], each add-on has its own project which is located under the `addOns` project/directory.

To build zap-extensions follow the instructions on:

https://www.zaproxy.org/docs/developer/quick-start-build/

[Gradle]: https://gradle.org/
