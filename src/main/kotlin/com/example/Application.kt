package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import org.jsoup.parser.Parser
import javax.lang.model.util.Elements

//import org.jsoup.select.Elements

val rss_site = "http://rss.cnn.com/rss/edition_africa.rss"

fun main() {
//    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
//        configureRouting()
//    }.start(wait = true)
//    println("hello")
    val doc = Jsoup.connect(rss_site).parser(Parser.xmlParser()).get()
//    println(doc)
//    log(doc.title())
//    println(doc.select("a").first())
    val link: Element = doc.select("description").first()
    println(link)
    for(some in doc.select("description")){
        println(some)
    }





}
