package com.trild.xmlretrofitapplication.Model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Path
import org.simpleframework.xml.Root


@Root(name = "rss", strict = false)
class RSSFeed {
    @Element(name = "title")
    @Path("channel")
    var channelTitle: String? = null

    @ElementList(name = "item", inline = true)
    @Path("channel")
    var articleList: List<Article>? = null
}
/*Bên cạnh XML header, file này còn chứa các phần tử XML khác nhau. rss-element không chỉ chứa channel-element mà còn chứa các phần tử khác (như title, description, pubDate) và một số item-element.

Tạo hai lớp dữ liệu có tên RSSFeed và Article.*/
/*Với annotation @Root class được đánh dấu là (de)serialized. Tùy theo lựa chọn, bạn có thể cung cấp tên trong annotation @Root đại diện cho tên của XML element.

Khi strict được set là false, strict parsing sẽ bị tắt. Điều này báo cho trình phân tích cú pháp không bị lỗi và đưa ra một ngoại lệ, nếu element hoặc attribute XML được tìm thấy mà không có ánh xạ nào được cung cấp.*/