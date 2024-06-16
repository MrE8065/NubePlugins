// use an integer for version numbers
version = 1


cloudstream {

    language = "es"
    description = "Plugin para acceder a AnimeFLV"
    authors = listOf("MrE8065")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1

    tvTypes = listOf(
        "AnimeMovie",
        "Anime",
        "OVA",
    )
    
    iconUrl = "http://www.google.com/s2/favicons?domain=www3.animeflv.net"
}
