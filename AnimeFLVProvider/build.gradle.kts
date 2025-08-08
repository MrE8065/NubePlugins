dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

// Use an integer for version numbers
version = 1

cloudstream {
    // All of these properties are optional, you can safely remove any of them.

    description = "Plugin para acceder a AnimeFLV"
    authors = listOf("MrE8065")

    /**
    * Status int as one of the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta-only
    **/
    status = 1 // Will be 3 if unspecified

    tvTypes = listOf(
        "AnimeMovie",
        "Anime",
        "OVA",
    )

    requiresResources = true
    language = "es"

    // Random CC logo I found
    iconUrl = "http://www.google.com/s2/favicons?domain=www3.animeflv.net"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}