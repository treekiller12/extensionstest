// use an integer for version numbers
version = 2


cloudstream {
    language = "pl"
    // All of these properties are optional, you can safely remove them

    // description = "EkinoProvider"
    authors = listOf("TreeKiller")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1
    tvTypes = listOf(
        "Movie",
        "TvSeries"
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=https://ekino-tv.pl/&sz=%size%"
}
