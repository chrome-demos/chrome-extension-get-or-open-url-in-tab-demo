Chrome Extension Get Or Open specified Url in Tab Demo
======================================================

Check if specified url is opened in tab, select it or open it in new tab.

Notice
------

- We have to include `tabs` as `permissions` in `manifest.json`, otherwise the url of tabs we get are always `underfined`.
- `*://*.taobao.com` is not valid url pattern, but `*://*.taobao.com/` or `*://*.taobao.com/*` is
- `<all_urls>` is for all urls

Build:
-----

```
./gradlew compileKotlin2Js
cd extension
npm install
```

Install:
--------

Chrome -> `Extensions` -> Enable `Developer Mode` -> `Load unpacked` -> select the `extension` directory of this project.

Open a page, and click the icon of this extension on toolbar, you will see a popup dialog with current url.

Resource
--------

- url pattern: <https://developer.chrome.com/extensions/match_patterns>