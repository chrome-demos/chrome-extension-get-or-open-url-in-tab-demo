package example

import JsObj
import chrome.tabs.CreateProperties
import chrome.tabs.QueryInfo
import chrome.tabs.UpdateProperties
import kotlin.browser.window

fun main(args: Array<String>) {
    chrome.tabs.query(JsObj<QueryInfo>().apply {
        this.url = "*://*.taobao.com/*"
    }) { tabs ->
        if (tabs.isEmpty()) {
            openNewTab()
        } else {
            window.alert("Found one taobao tab, select it now")
            chrome.tabs.update(tabs.first().id!!, JsObj<UpdateProperties>().apply {
                this.highlighted = true
            })
        }
    }
}

private fun openNewTab() {
    chrome.tabs.create(JsObj<CreateProperties>().apply {
        this.url = "https://taobao.com"
    })
}
