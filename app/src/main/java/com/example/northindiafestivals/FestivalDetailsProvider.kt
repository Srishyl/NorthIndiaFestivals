package com.example.northindiafestivals

object FestivalDetailsProvider {

    fun getFestivalDetails(state: String): List<FestivalDetail> {
        return when (state) {

            "Delhi" -> listOf(
                FestivalDetail(
                    "Diwali",
                    "Diwali, also known as Deepavali, is one of the most celebrated and significant festivals in India. The word Deepavali means “a row of lights” in Sanskrit, symbolizing the victory of light over darkness and good over evil. It is celebrated by millions of Hindus, Sikhs, Jains, and Buddhists around the world. The festival usually falls between October and November, depending on the lunar calendar, and lasts for five days, each day having its own importance. The first day is Dhanteras, when people buy gold, silver, or utensils as a sign of prosperity. The second day, Naraka Chaturdashi or Choti Diwali, marks Lord Krishna’s victory over the demon Narakasura. The third day is the main Diwali day, when homes are illuminated with diyas and lights, people wear new clothes, exchange sweets and gifts, and worship Goddess Lakshmi, the goddess of wealth and prosperity, along with Lord Ganesha, the remover of obstacles.\n" +
                            "\n" +
                            "On Diwali night, people decorate their homes with colorful rangolis, light clay lamps, and burst fireworks to celebrate joy and victory. According to the Ramayana, Diwali commemorates Lord Rama’s return to Ayodhya after 14 years of exile and his triumph over the demon king Ravana. In some regions, it marks Lord Krishna’s victory over Narakasura, while for Jains, it signifies Lord Mahavira’s attainment of Nirvana. Sikhs celebrate it as Bandi Chhor Divas, the day Guru Hargobind Ji was freed from imprisonment. Thus, Diwali holds different meanings across religions, yet unites everyone in the spirit of joy, peace, and togetherness. The festival teaches values such as truth, love, and kindness, reminding us that goodness always triumphs over evil.\n" +
                            "\n" +
                            "People clean and decorate their homes before Diwali, believing that Goddess Lakshmi visits the cleanest and brightest houses first. The festival also marks new beginnings — many businesses close their old accounts and open new ones, and families forgive old disputes to start afresh. Traditional sweets like laddoo, barfi, and kaju katli are prepared and shared with friends and neighbors. Streets, temples, and markets glow with lights and decorations, and cultural programs are organized everywhere. Diwali spreads happiness not only through lights and sweets but also through the warmth of human connection.\n" +
                            "\n" +
                            "In South India, the festival celebrates the defeat of Narakasura, while in West Bengal, it coincides with Kali Puja dedicated to Goddess Kali. In North India, it represents the return of Lord Rama to Ayodhya. Across the globe, Indian communities celebrate Diwali with the same enthusiasm, making it a universal symbol of light, joy, and hope. In recent years, awareness about eco-friendly celebrations has grown, encouraging people to light earthen diyas instead of plastic lamps and avoid loud firecrackers to reduce pollution. This promotes sustainability and supports local artisans.\n" +
                            "\n" +
                            "Beyond rituals and celebrations, Diwali encourages self-reflection and generosity. It inspires people to spread kindness, share with the needy, and nurture inner peace. The lighting of lamps represents the illumination of the mind and soul — driving away ignorance and bringing wisdom. Diwali reminds us that even the smallest diya can brighten the darkest night, and that goodness, when shared, multiplies. The festival strengthens family bonds, unites communities, and fills hearts with positivity. In essence, Diwali is not just a festival of lights but also a celebration of hope, renewal, and harmony. It encourages us to choose light over darkness, knowledge over ignorance, and compassion over hatred. Truly, Diwali continues to shine as a timeless symbol of love, prosperity, and spiritual enlightenment."
                ),
                FestivalDetail(
                    "Holi",
                    "Holi in Delhi is celebrated with vibrant colours, music and dance. " +
                            "People throw gulaal on each other, enjoy traditional drinks like thandai " +
                            "and take part in Holi parties across the city. It marks the victory of good over evil."
                ),
                FestivalDetail(
                    "Eid",
                    "Eid in Delhi is marked with morning prayers at Jama Masjid. " +
                            "People visit each other’s homes, exchange gifts and enjoy feasts like biryani and sewaiyan."
                ),
                FestivalDetail(
                    "Dussehra",
                    "Delhi hosts grand Ramlila shows, especially at the Red Fort grounds. " +
                            "Effigies of Ravana, Kumbhkaran and Meghnath are burned, symbolizing the triumph of good over evil."
                ),
                FestivalDetail(
                    "Republic Day Parade",
                    "On 26th January, Delhi hosts India's biggest parade at Kartavya Path. " +
                            "It displays India’s cultural heritage, military strength and patriotic performances."
                )
            )

            "Punjab" -> listOf(
                FestivalDetail(
                    "Baisakhi",
                    "Baisakhi is the harvest festival and Sikh New Year. " +
                            "People visit Gurudwaras, especially the Golden Temple, and celebrate with bhangra and gidda. " +
                            "It also marks the formation of the Khalsa in 1699."
                ),
                FestivalDetail(
                    "Lohri",
                    "Lohri is celebrated with bonfires, traditional songs and dancing. " +
                            "It marks the end of winter and the beginning of longer days."
                ),
                FestivalDetail(
                    "Gurpurab",
                    "Gurpurab celebrates the birth anniversaries of Sikh Gurus. " +
                            "People participate in kirtan, processions and langar."
                ),
                FestivalDetail(
                    "Hola Mohalla",
                    "A Sikh warrior festival held in Anandpur Sahib. " +
                            "It features mock battles, martial arts and horse-riding displays."
                )
            )

            "Haryana" -> listOf(
                FestivalDetail(
                    "Teej",
                    "Teej is one of the most vibrant and culturally rich festivals celebrated primarily in Haryana, Rajasthan, Punjab, and parts of North India. It marks the arrival of the monsoon season and is dedicated to Goddess Parvati and her reunion with Lord Shiva. The festival symbolizes love, devotion, and marital bliss, making it especially significant for married women who pray for the well-being and longevity of their husbands.\n" +
                            "\n" +
                            "The term “Teej” refers to the third day after the new moon or full moon, and the festival is observed in the month of Shravana (Sawan) and Bhadrapada (Bhado) according to the Hindu lunar calendar. There are mainly three types of Teej festivals celebrated across India — Hariyali Teej, Kajari Teej, and Hartalika Teej — each with its own rituals and regional significance.\n" +
                            "\n" +
                            "Hariyali Teej, celebrated in the lush green month of Sawan, is associated with the onset of monsoon rains and the rejuvenation of nature. It signifies prosperity, fertility, and happiness. Women wear green-colored attire, symbolizing growth and life, and adorn themselves with beautiful bangles, henna, and jewelry. They sing traditional folk songs and dance to celebrate the joy of the season. Swings decorated with flowers are set up in courtyards and gardens, and women enjoy swinging while singing songs of love and devotion.\n" +
                            "\n" +
                            "Kajari Teej, which follows Hariyali Teej, is observed mainly in Uttar Pradesh and parts of Madhya Pradesh and Bihar. On this day, women worship the moon and sing soulful folk songs known as Kajris, which often express emotions of love, separation, and longing for their partners during the rainy season. Fasting is an important part of Kajari Teej, where women abstain from food and pray for the welfare of their husbands and families.\n" +
                            "\n" +
                            "Hartalika Teej, the most widely celebrated among all, marks the day when Goddess Parvati performed intense penance to win Lord Shiva as her husband. The legend says that Parvati fasted and prayed with unwavering devotion, and her wish was finally fulfilled when Shiva accepted her as his consort. In honor of this, women observe a nirjala vrat (fast without water) and worship Lord Shiva and Goddess Parvati together, symbolizing eternal love and commitment. The idols of the divine couple are beautifully decorated with flowers and ornaments, and prayers are offered throughout the night.\n" +
                            "\n" +
                            "In Haryana and Rajasthan, Teej is celebrated as a cultural festival that reflects local traditions and community bonding. Colorful fairs are organized where people gather to enjoy folk music, dances, puppet shows, and traditional cuisines like ghevar, malpua, and poori. Married women visit their parental homes, receive gifts and clothes from their families, and celebrate the festival with their friends and relatives. The sight of women in bright green sarees, applying mehendi (henna), and enjoying swings in the rain-filled air gives the festival a joyous and refreshing charm.\n" +
                            "\n" +
                            "The festival not only celebrates marital love but also signifies the bond between nature and humanity. As the monsoon brings life to the earth, Teej represents the renewal of hope, happiness, and relationships. It is a time when women express gratitude, devotion, and faith, while communities come together to honor their shared culture and values.\n" +
                            "\n" +
                            "In essence, Teej is a celebration of womanhood, devotion, and the beauty of life. It blends spirituality with festivity, reminding everyone of the importance of love, faith, and the cycles of nature. Through songs, dance, fasting, and prayers, Teej continues to inspire generations to cherish relationships and celebrate the blessings of togetherness and renewal."
                ),
                FestivalDetail(
                    "Baisakhi",
                    "Haryana celebrates Baisakhi with energetic folk dances and fairs."
                ),
                FestivalDetail(
                    "Gugga Naumi",
                    "Festival dedicated to Gugga Pir, worshipped for protection from snakes."
                )
            )

            "Uttar Pradesh" -> listOf(
                FestivalDetail(
                    "Deepotsav",
                    "Deepotsav in Ayodhya is world-famous. Millions of diyas are lit on the banks of the Saryu River. " +
                            "The entire city glows as it celebrates the return of Lord Rama."
                ),
                FestivalDetail(
                    "Kumbh Mela",
                    "Held in Prayagraj, this is the world’s largest spiritual gathering. " +
                            "Millions take a holy dip at Sangam for spiritual purification."
                ),
                FestivalDetail(
                    "Janmashtami",
                    "Celebrating the birth of Lord Krishna with Dahi-Handi, devotional songs and beautifully decorated temples."
                )
            )

            "Rajasthan" -> listOf(
                FestivalDetail(
                    "Pushkar Fair",
                    "A traditional camel fair with cultural shows, livestock trading, folk dance and rural competitions."
                ),
                FestivalDetail(
                    "Desert Festival",
                    "Held in Jaisalmer showcasing desert culture, camel races, folk dances and turban tying contests."
                ),
                FestivalDetail(
                    "Teej",
                    "Women celebrate Teej with swings, colourful attire and traditional songs."
                )
            )

            "Bihar" -> listOf(
                FestivalDetail(
                    "Chhath Puja",
                    "A major festival devoted to the Sun God. People fast, prepare prasad and offer Arghya at sunrise and sunset."
                ),
                FestivalDetail(
                    "Sonepur Mela",
                    "One of Asia’s oldest fairs known for cattle trading, folk programs and rural crafts."
                )
            )

            "Uttarakhand" -> listOf(
                FestivalDetail(
                    "Harela",
                    "A green festival celebrating the monsoon and the beginning of a new harvest cycle. Tree planting is common."
                ),
                FestivalDetail(
                    "Kumbh Mela",
                    "Haridwar hosts Kumbh Mela where millions gather to take a holy dip in the Ganges."
                )
            )

            "Himachal Pradesh" -> listOf(
                FestivalDetail(
                    "Kullu Dussehra",
                    "A week-long cultural festival with Rath Yatra, folk dance and rituals."
                ),
                FestivalDetail(
                    "Losar",
                    "Tibetan New Year celebrated in Lahaul and Spiti with traditional dances and rituals."
                )
            )

            "Jammu and Kashmir" -> listOf(
                FestivalDetail(
                    "Tulip Festival",
                    "Held in Srinagar’s Tulip Garden, Asia's largest. It celebrates spring with thousands of blooming flowers."
                ),
                FestivalDetail(
                    "Eid",
                    "People offer prayers, give charity and enjoy the traditional Kashmiri wazwan feast."
                ),
                FestivalDetail(
                    "Lohri",
                    "Celebrated with bonfires, songs and folk dances marking winter's end."
                )
            )

            else -> listOf(
                FestivalDetail(
                    "No Festival",
                    "No festival information available for this state."
                )
            )
        }
    }
}
