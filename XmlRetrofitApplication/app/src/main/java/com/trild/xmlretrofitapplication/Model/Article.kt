package com.trild.xmlretrofitapplication.Model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root


@Root(name = "item", strict = false)
class Article {
    @Element(name = "title")
    var title: String? = null

    @Element(name = "link")
    var link: String? = null
}
/*Lớp Article đại diện cho một bài báo duy nhất và chỉ lưu trữ tiêu đề và liên kết đến nó. Đây là mảng duy nhất chúng tôi quan tâm.*/