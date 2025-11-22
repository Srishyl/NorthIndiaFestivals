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
                    "Holi in Delhi is famous for its vibrant colors, energetic music and joyful celebrations. It begins with Holika Dahan, where people burn bonfires to symbolize the destruction of evil and protection from negative influences.\n" +
                            "On the next day, known as Rangwali Holi, people apply colored powder (gulal) and splash water on each other. Children run around with water guns and balloons, while adults enjoy music, dance and traditional sweets.\n" +
                            "Delhi hosts many theme-based Holi events, color festivals, rain dance parties and organic-color celebrations in places like Connaught Place, Saket and university campuses.\n" +
                            "Traditional food such as gujiya, malpua, dahi bhalla and thandai are commonly served. Many temples organize devotional singing, while friends and families visit each other to exchange festive greetings.\n" +
                            "One of the special aspects of Delhi’s Holi is its blend of traditional and modern styles — you’ll find simple family gatherings in colonies and flashy DJ events in clubs. The festival marks the arrival of spring and strengthens friendships, forgiveness and happiness."
                ),
                FestivalDetail(
                    "Eid",
                    "Eid in Delhi is celebrated with devotion, joy and cultural richness. On Eid morning, thousands of people gather for prayers at major mosques such as Jama Masjid, Fatehpuri Masjid and Nizamuddin Dargah. The sight of people filling the area around Jama Masjid is iconic and represents unity and brotherhood.\n" +
                            "People wear new traditional clothes, mostly in white or colorful festive attire, and greet each other saying “Eid Mubarak.”\n" +
                            "Food plays a very important role during Eid in Delhi. Families prepare delicious dishes like biryani, kebabs, haleem, nihari and the famous dessert sheer kurma, a special sweet vermicelli milk dish.\n" +
                            "Old Delhi markets such as Matia Mahal, Ballimaran and Zakir Nagar become lively with food stalls, clothing shops, perfumes, henna and festive stalls.\n" +
                            "An important part of Eid is charity — people donate food, clothes or money to the poor so everyone can enjoy the festival.\n" +
                            "Eid in Delhi is known for bringing people of all communities together, promoting peace, sharing and compassion."
                ),
                FestivalDetail(
                    "Dussehra",
                    "Dussehra in Delhi is known for grand Ramlila performances and the burning of giant effigies of Ravana, Kumbhkaran and Meghnath. These events take place across the city, especially in areas like Red Fort Grounds (Lal Qila Maidan), Subhash Maidan, Janakpuri and many local parks.\n" +
                            "Ramlila groups rehearse for weeks to enact the Ramayana story with drama, music, costumes and stage effects. Tens of thousands gather to watch these shows.\n" +
                            "On the final day of Navratri, the effigy burning takes place symbolizing the victory of good (Rama) over evil (Ravana). Fireworks light up the sky, food stalls serve traditional snacks, and children enjoy swings, toys and games.\n" +
                            "The festival also includes worship of Goddess Durga, as it marks the end of her nine-day festival. Many people observe fasting during Navratri and break their fast on Dussehra.\n" +
                            "Dussehra in Delhi is an important cultural event that unites families and communities and teaches the virtues of truth, righteousness and discipline."
                ),
                FestivalDetail(
                    "Republic Day Parade",
                    "The Republic Day Parade held in Delhi on 26 January is India’s most prestigious national event. It takes place on Kartavya Path, starting from Rashtrapati Bhavan and passing through India Gate.\n" +
                            "The event begins with the President unfurling the national flag, followed by a 21-gun salute.\n" +
                            "The Indian Army, Navy and Air Force participate with marching contingents, military bands, tanks, missiles and defense equipment on display. The Air Force performs a breathtaking fly-past of fighter jets, helicopters and transport aircraft.\n" +
                            "One of the highlights is the State Tableaux, colorful floats representing the art, culture, festivals and achievements of different Indian states.\n" +
                            "School children perform patriotic dances and physical displays. Brave children who receive the National Bravery Award participate in the parade riding jeeps.\n" +
                            "Millions watch the event live on television, making it a moment of patriotism, pride and national unity. The celebration continues until the Beating Retreat ceremony on 29th January."
                )
            )

            "Punjab" -> listOf(
                FestivalDetail(
                    "Baisakhi",
                    "Baisakhi is one of the most important and grandly celebrated festivals in Punjab. It marks the beginning of the Punjabi New Year and the harvest season for wheat, the state’s major crop. For farmers, Baisakhi signifies joy, prosperity and gratitude for a successful harvest. They visit fields, thank nature and celebrate with dance, music and feasting.\n" +
                            "Baisakhi is also a deeply spiritual festival for Sikhs because it commemorates the formation of the Khalsa Panth by Guru Gobind Singh in 1699 at Anandpur Sahib. On this day, large gatherings take place at Gurudwaras, especially the Golden Temple in Amritsar, where thousands participate in prayers, kirtans (devotional singing) and community meals called langar.\n" +
                            "People wear colorful traditional clothes, and the famous Punjabi folk dances Bhangra and Gidda are performed everywhere. Villages and towns host fairs (melas) featuring rides, games, wrestling matches, handicrafts and traditional Punjabi foods such as makki di roti, sarson da saag and lassi.\n" +
                            "The festival symbolizes new beginnings, unity and the spirit of courage and equality taught by the Sikh Gurus."
                ),
                FestivalDetail(
                    "Lohri",
                    "Lohri is a beautiful Punjabi winter festival that celebrates the end of the cold season and the arrival of longer, warmer days. It is traditionally connected to the harvesting of sugarcane and is a festival of joy, light and warmth.\n" +
                            "People gather around a large bonfire in the evening, a symbol of energy and positivity. They throw til (sesame seeds), gur (jaggery), popcorn and peanuts into the fire as offerings for prosperity. Families sing traditional Lohri songs praising folk heroes like “Sunder Mundriye.”\n" +
                            "Lohri holds special importance for newlywed couples and newborn babies — their first Lohri is celebrated with extra enthusiasm, gifts, music and blessings.\n" +
                            "After prayers, people dance the lively bhangra and gidda around the bonfire, celebrating the richness of Punjabi culture. Delicious winter foods such as rewri, gachak, makki di roti, sarson da saag, and warm drinks like jaggery tea are enjoyed.\n" +
                            "Lohri is not just a harvest festival — it’s a symbol of joy, community bonding and gratitude for nature’s blessings."
                ),
                FestivalDetail(
                    "Gurpurab",
                    "Gurpurab refers to the birth anniversaries of Sikh Gurus, and the most celebrated is Guru Nanak Jayanti, marking the birth of Guru Nanak Dev Ji, the founder of Sikhism. Punjab celebrates Gurpurab with immense devotion and spiritual energy.\n" +
                            "Celebrations begin with Akhand Path, a continuous 48-hour reading of the Guru Granth Sahib. Early morning Prabhat Pheris (devotional processions) move through the streets with singing of hymns.\n" +
                            "On the main day, Gurudwaras are beautifully decorated and illuminated. Devotees visit to listen to kirtan, participate in prayer services and attend the Guru Ka Langar — a free community kitchen that serves meals to everyone regardless of caste, religion or background.\n" +
                            "Nagar Kirtans (religious processions) are a major highlight, where the Guru Granth Sahib is carried in a decorated float accompanied by devotional singing, traditional instruments and Gatka (Sikh martial arts) performances.\n" +
                            "Gurpurab spreads the message of humility, service, unity and the teachings of the Gurus — equality, compassion and devotion."
                ),
                FestivalDetail(
                    "Hola Mohalla",
                    "Hola Mohalla is a unique Sikh festival celebrated a day after Holi, mainly at Anandpur Sahib in Punjab. It was established by the tenth Sikh Guru, Guru Gobind Singh, as a day for Sikhs to demonstrate martial spirit, discipline and unity.\n" +
                            "Tens of thousands of devotees gather at Anandpur Sahib to witness spectacular displays of Gatka (traditional martial art), sword fighting, spear throwing, archery, horseback riding and mock battle reenactments. The Nihang Sikhs, known for their blue attire and warrior tradition, play a major role in these performances.\n" +
                            "The festival also includes devotional singing, kirtan, poetry recitations and storytelling sessions. Large community kitchens serve langar to thousands of visitors throughout the day.\n" +
                            "Hola Mohalla combines spirituality with physical strength and bravery, reminding Sikhs of their historical heritage and warrior identity.\n" +
                            "While Holi focuses on colors and celebration, Hola Mohalla emphasizes courage, discipline and service. It is one of the most culturally rich and powerful festivals in Punjab."
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
                    "n Haryana, Baisakhi is celebrated with agricultural devotion and community unity. For farmers, it marks the harvesting of the wheat crop, bringing hope and prosperity.\n" +
                            "Villages hold fairs with wrestling matches, tug-of-war, bullock cart races and folk dances like phag dance.\n" +
                            "People visit temples to offer thanks for a good harvest and pray for the upcoming season.\n" +
                            "Traditional meals like bajra roti, saag, butter and lassi are prepared.\n" +
                            "Baisakhi strengthens community ties and reflects Haryana’s rural pride and farming lifestyle."
                ),
                FestivalDetail(
                    "Gugga Naumi",
                    "Gugga Naumi is a unique folk festival dedicated to Gugga Pir, a heroic figure believed to protect people from snake bites.\n" +
                            "Devotees form processions with flags, decorated horses and drums. Folk singers narrate stories about Gugga Pir’s bravery and miracles.\n" +
                            "People draw snake symbols on walls and offer turmeric, rice, milk and flowers.\n" +
                            "Children place small mud snake models at home doors for protection.\n" +
                            "In many villages, a procession called “Gugga Par” moves house to house giving blessings.\n" +
                            "The festival reflects Haryana’s connection to nature, folk traditions and protective deities."
                )
            )

            "Uttar Pradesh" -> listOf(
                FestivalDetail(
                    "Deepotsav",
                    "Deepotsav in Ayodhya has gained international recognition for lighting millions of diyas along the Sarayu River and across the sacred city.\n" +
                            "It celebrates the return of Lord Rama, Sita and Lakshmana after 14 years of exile.\n" +
                            "Ram Ki Paidi ghats glow with endless rows of lamps, creating a heavenly golden reflection on the water.\n" +
                            "The entire city becomes a stage for cultural shows, Ram-Leela performances, fireworks, drone shows and classical dance events.\n" +
                            "Ayodhya breaks Guinness World Records every year for lamp illumination.\n" +
                            "The festival promotes devotion, tourism and the cultural revival of Ramayana traditions."
                ),
                FestivalDetail(
                    "Kumbh Mela",
                    "Kumbh Mela is the largest religious gathering on Earth. Held at Prayagraj, it celebrates the spiritual importance of the Sangam, the meeting point of Ganga, Yamuna and Saraswati.\n" +
                            "Millions arrive to take the sacred bath, believed to purify the soul.\n" +
                            "Sadhus from different akharas arrive in grand processions, chanting holy mantras.\n" +
                            "Ash-smeared Naga sadhus, saints performing yoga, spiritual talks, meditation camps and chanting create a divine atmosphere.\n" +
                            "The event represents India’s deep spiritual heritage and attracts visitors from across the globe."
                ),
                FestivalDetail(
                    "Janmashtami",
                    "Janmashtami in Mathura and Vrindavan celebrates the birth of Lord Krishna, making it one of the most emotional and devotional festivals in India.\n" +
                            "Temples are decorated with flowers, lights and Jhankis (scenes from Krishna’s life).\n" +
                            "Devotees fast the entire day and break it only after midnight, the birth time of Krishna.\n" +
                            "In Vrindavan, ISKCON temple, Banke Bihari temple and Mathura’s Janmabhoomi temple witness huge crowds.\n" +
                            "Dahi-Handi competitions recreate Krishna’s childhood activities of stealing butter.\n" +
                            "Ras-Leela dance dramas narrate his playful life with Radha and the gopis.\n" +
                            "The festival spreads devotion, love, joy and spiritual purity."
                )
            )

            "Rajasthan" -> listOf(
                FestivalDetail(
                    "Pushkar Fair",
                    "The Pushkar Fair, held in the holy town of Pushkar near Ajmer, is one of the world’s largest camel and livestock fairs. The event lasts nearly a week and transforms the desert landscape into a vibrant carnival. Farmers bring thousands of camels, horses, and cattle, all decorated with colorful saddles, beads and cloth. The fairground becomes a bustling arena of buying, selling and showcasing livestock.\n" +
                            "Apart from trading, visitors enjoy folk music, Kalbelia dance, puppet shows, magic shows, acrobatics and traditional competitions. Camel races, moustache competitions, turban-tying contests and rural sports attract huge crowds.\n" +
                            "Pilgrims visit the sacred Pushkar Lake to take a holy dip, especially on Kartik Purnima, which is believed to wash away sins. The famous Brahma Temple, one of the few dedicated to Lord Brahma, draws thousands of devotees.\n" +
                            "Markets sell Rajasthani jewelry, handicrafts, textiles and leather goods. The fair beautifully blends spirituality, culture, art, music and rural life. It showcases the rich traditions of Rajasthan and attracts tourists from all over the world."
                ),
                FestivalDetail(
                    "Desert Festival",
                    "Held in the golden city of Jaisalmer, the Desert Festival is a lively celebration of desert culture and heritage. The sand dunes near Sam village become a grand venue for performances, competitions and cultural displays.\n" +
                            "Famous Rajasthani folk dances like Ghoomar and Kalbelia captivate audiences with rhythmic movements and colorful attire. Musicians play traditional instruments like sarangi and morchang.\n" +
                            "Tourists enjoy events such as camel polo, camel dance shows, fire dances, turban-tying competitions and best-moustache contests. The festival also includes puppet shows, martial arts performances, and traditional desert rituals.\n" +
                            "One of the highlights is the nighttime event on the dunes, where folk artists perform under starlit skies, creating a magical experience.\n" +
                            "The Desert Festival showcases the strength, beauty and resilience of life in Rajasthan’s Thar Desert."
                ),
                FestivalDetail(
                    "Teej",
                    "In Rajasthan, Teej is celebrated with grandeur and devotion, especially in Jaipur and Udaipur. The festival honors Goddess Parvati’s reunion with Lord Shiva and marks the arrival of the monsoon.\n" +
                            "Women dress in colorful lehengas and green sarees, apply mehendi, wear glass bangles and sing traditional songs.\n" +
                            "The streets of Jaipur come alive with the Teela Mata procession, featuring an idol of Goddess Parvati carried on a beautifully decorated palanquin accompanied by elephants, horses, dancers and musicians.\n" +
                            "Women enjoy swings hung from trees, participate in folk dances and visit each other’s homes to exchange sweets like ghevar and fenia.\n" +
                            "Markets sell traditional jewelry, lahariya sarees and festive accessories.\n" +
                            "Teej is a symbol of love, prosperity, beauty and the refreshing arrival of rains that bring life to the desert landscape."
                )
            )

            "Bihar" -> listOf(
                FestivalDetail(
                    "Chhath Puja",
                    "Chhath Puja is one of the most sacred and deeply spiritual festivals of Bihar, dedicated to worshipping Surya Dev (Sun God) and Chhathi Maiya. It is known for its strict rituals and purity.\n" +
                            "The festival lasts four days, involving fasting, holy bathing, offering arghya (water offerings) to the sun at sunrise and sunset, and maintaining complete cleanliness.\n" +
                            "Devotees stand in rivers or ponds with baskets of fruits, thekua, sugarcane and holy offerings as they pray for health, prosperity and family welfare.\n" +
                            "The ghats of Patna become beautifully decorated with lights, bamboo structures and rangolis. The peaceful atmosphere, traditional songs, and devotion create an unforgettable experience.\n" +
                            "Chhath is unique because it involves no idol worship — only the worship of nature, purity and gratitude. It reflects discipline, dedication and spiritual strength."
                ),
                FestivalDetail(
                    "Sonepur Mela",
                    "The Sonepur Mela, also called the Harihar Kshetra Mela, is one of the oldest and largest rural fairs in Asia. It takes place at the confluence of the Ganga and Gandak rivers in Sonepur.\n" +
                            "Historically famous for being the largest cattle fair in India, the mela attracts farmers, traders, monks, artisans and tourists.\n" +
                            "The fair showcases Bihar’s rural culture — from folk dances and traditional songs to martial arts, wrestling and acrobatics.\n" +
                            "Stalls sell handicrafts, local foods, wooden toys, metal crafts, pottery and silk products.\n" +
                            "Devotees visit the nearby Hariharnath Temple to offer prayers.\n" +
                            "The mela represents Bihar’s traditional rural lifestyle, showcasing trade, spirituality and cultural heritage in one place."
                )
            )

            "Uttarakhand" -> listOf(
                FestivalDetail(
                    "Harela",
                    "Harela is a beautiful harvest and prosperity festival celebrated mainly in Kumaon region. The word “Harela” means “day of green” and the festival celebrates nature, greenery and new beginnings.\n" +
                            "People plant new saplings, symbolizing environmental balance and wishing for a good harvest.\n" +
                            "At home, seeds of wheat, barley and maize are sown in small baskets days before the festival. These sprouts (harela) are cut and placed behind ears as blessings.\n" +
                            "Families prepare traditional dishes and celebrate with folk songs and local dances.\n" +
                            "The festival teaches love for nature, environmental protection and gratitude for the earth’s resources."
                ),
                FestivalDetail(
                    "Kumbh Mela",
                    "Haridwar hosts the Kumbh Mela or Ardh-Kumbh on the banks of the sacred Ganga. Millions of devotees gather to take a holy dip at Har Ki Pauri, believing it purifies their soul and washes away sins.\n" +
                            "Monks, saints, akharas and devotees participate in grand processions with flags, horses and drums.\n" +
                            "Spiritual discourses, bhajans, yoga camps and religious discussions take place across Haridwar.\n" +
                            "The atmosphere is deeply spiritual, filled with chants, prayers and the fragrance of incense.\n" +
                            "It is one of the holiest events in Hindu tradition, symbolizing faith, devotion and spiritual awakening."
                )
            )

            "Himachal Pradesh" -> listOf(
                FestivalDetail(
                    "Kullu Dussehra",
                    "Kullu Dussehra is a unique week-long celebration held in the Kullu Valley. Unlike the rest of India, it begins on the day Dussehra ends elsewhere.\n" +
                            "Hundreds of local deities (devtas) from nearby villages arrive in decorated palanquins to pay tribute to Lord Raghunath.\n" +
                            "The sight of these colorful palanquins, drums, trumpets and dances creates a mesmerizing atmosphere.\n" +
                            "Cultural performances, fairs, handicraft stalls and traditional Himachali foods enrich the festival.\n" +
                            "The final ceremony involves a symbolic burning of Lanka, representing the destruction of evil."
                ),
                FestivalDetail(
                    "Losar",
                    "Losar is the Tibetan New Year celebrated with great enthusiasm in the cold desert regions of Himachal.\n" +
                            "People clean and decorate their homes, prepare special dishes, wear new traditional clothes and visit monasteries.\n" +
                            "Monks perform ritual dances like the Cham dance to chase away evil spirits.\n" +
                            "Families prepare foods like thukpa, momos, butter tea and traditional sweets.\n" +
                            "The festival symbolizes purification, good luck and the beginning of a new cycle."
                )
            )

            "Jammu and Kashmir" -> listOf(
                FestivalDetail(
                    "Tulip Festival",
                    "The Tulip Festival in Srinagar is a spectacular celebration of spring, held every year in April at the Indira Gandhi Memorial Tulip Garden — the largest tulip garden in all of Asia. Located at the foothills of the Zabarwan mountain range and overlooking the beautiful Dal Lake, the garden becomes a rainbow of colors with more than 1.5 million tulips blooming at once.\n" +
                            "The festival attracts tourists, botanists, nature lovers and photographers from across the world. Different varieties of tulips such as Parrot Tulips, Double Bloom, fringed tulips and single early tulips are planted in well-organized terraces, creating breathtaking views.\n" +
                            "Apart from the flowers, the festival also showcases Kashmiri culture through handicraft stalls, cultural dances, live music, and exhibitions of traditional arts like papier-mâché, carpets and pashmina.\n" +
                            "Local Kashmiri dishes such as kehwa, rogan josh, gushtaba, and local breads are available for visitors. The festival not only boosts tourism but also symbolizes new beginnings, peace and the natural beauty of the Kashmir Valley."
                ),
                FestivalDetail(
                    "Eid",
                    "Eid in Jammu & Kashmir is celebrated with devotion and deep cultural belonging. On Eid morning, thousands gather at Eidgahs and mosques for mass prayers. The serenity of Eid gatherings in Kashmir — surrounded by mountains, rivers and beautiful valleys — gives the celebration a unique feel.\n" +
                            "People wear new pherans or traditional dresses and exchange warm greetings. The homes are filled with the aroma of sheer khurma, phirni, and Kashmiri wazwan dishes like rista, tabak maaz and yakhni.\n" +
                            "Children receive gifts and eidi from elders, and families visit relatives to offer blessings.\n" +
                            "Kashmiris also believe strongly in charity, so many people donate food, clothes or money to the needy, making sure everyone has a happy Eid.\n" +
                            "Streets become lively with shops selling dry fruits, bakery items, perfumes and festive outfits. Eid in Kashmir beautifully blends spirituality, family bonding and the region’s rich culinary heritage."
                ),
                FestivalDetail(
                    "Lohri",
                    "In Jammu, Lohri is celebrated with enthusiasm as a winter harvest festival. Families gather around a bonfire on the cold January night, offering puffed rice, peanuts, jaggery and sesame seeds to the fire.\n" +
                            "Women wear traditional phirans and jewelry, while children go from house to house singing Lohri songs and receiving sweets.\n" +
                            "Bonfires symbolize warmth, hope and the end of the harsh winter.\n" +
                            "Newlyweds and parents of newborn babies celebrate their first Lohri with extra joy, inviting relatives for feasts.\n" +
                            "Folk dances like gidda and bhangra are performed, and communities come together to share traditional dishes like rajma, makki di roti and various dry fruits.\n" +
                            "In Jammu, Lohri represents the spirit of togetherness, gratitude and cultural pride."
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
