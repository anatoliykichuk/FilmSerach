package ru.geekbrains.filmserach.data

import ru.geekbrains.filmserach.R

const val PATH = "https://api.kinopoisk.dev"
const val END_POINT = "movie"
const val TOKEN = "AF2F5V2-SGRM6NN-JDNY2ZC-K6Z71K7"
const val FILM_DATABASE = "film_database"
const val SELECTED_FILM = "selected_film"
const val EMPTY_POSTER_PATH = R.drawable.no_poster
const val YEARS_FOR_STEP = 10F
const val INITIAL_YEAR = 1890F
const val POPULARITY_FOR_STEP = 1F
const val INITIAL_POPULARITY = 0F
const val END_POPULARITY = 10F

fun getAllGenres(): List<String> {
    return listOf<String>(
        "боевик",
        "фэнтези",
        "фантастика",
        "триллер",
        "военный"
//        "детектив",
//        "комедия",
//        "драма",
//        "ужасы",
//        "криминал",
//        "мелодрама",
//        "вестерн",
//        "биография",
//        "аниме",
//        "детский",
//        "мультфильм",
//        "фильм-нуар",
//        "для взрослых",
//        "документальный",
//        "игра",
//        "история",
//        "концерт",
//        "короткометражка",
//        "музыка",
//        "мюзикл",
//        "новости",
//        "приключения",
//        "реальное ТВ",
//        "семейный",
//        "спорт",
//        "ток-шоу",
//        "церемония"
    )
}

fun getAllCountries(): Map<String, String> {
    return mapOf<String, String>(
        "avstraliya" to "Австралия",
        "avstriya" to "Австрия",
        "azerbajdzhan" to "Азербайджан",
        "albaniya" to "Албания",
        "alzhir" to "Алжир",
        "amerikanskie-virginskie-ostrova" to "Американские Виргинские острова",
        "amerikanskoe-samoa" to "Американское Самоа",
        "angola" to "Ангола",
        "andorra" to "Андорра",
        "antarktida" to "Антарктида",
        "antigua-i-barbuda" to "Антигуа и Барбуда",
        "antilskie-ostrova" to "Антильские Острова",
        "argentina" to "Аргентина",
        "armeniya" to "Армения",
        "aruba" to "Аруба",
        "afganistan" to "Афганистан",
        "bagamy" to "Багамы",
        "bangladesh" to "Бангладеш",
        "barbados" to "Барбадос",
        "bahrejn" to "Бахрейн",
        "belarus" to "Беларусь",
        "beliz" to "Белиз",
        "belgiya" to "Бельгия",
        "benin" to "Бенин",
        "bereg-slonovoj-kosti" to "Берег Слоновой кости",
        "bermudy" to "Бермуды",
        "birma" to "Бирма",
        "bolgariya" to "Болгария",
        "boliviya" to "Боливия",
        "bosniya" to "Босния",
        "bosniya-i-gercegovina" to "Босния и Герцеговина",
        "botsvana" to "Ботсвана",
        "braziliya" to "Бразилия",
        "brunej-darussalam" to "Бруней-Даруссалам",
        "burkina-faso" to "Буркина-Фасо",
        "burundi" to "Бурунди",
        "butan" to "Бутан",
        "vanuatu" to "Вануату",
        "vatikan" to "Ватикан",
        "velikobritaniya" to "Великобритания",
        "vengriya" to "Венгрия",
        "venesuela" to "Венесуэла",
        "virginskie-ostrova-velikobritaniya" to "Виргинские Острова (Великобритания)",
        "virginskie-ostrova-ssha" to "Виргинские Острова (США)",
        "vneshnie-malye-ostrova-ssha" to "Внешние малые острова США",
        "vetnam" to "Вьетнам",
        "vetnam-severnyj" to "Вьетнам Северный",
        "gabon" to "Габон",
        "gaiti" to "Гаити",
        "gajana" to "Гайана",
        "gambiya" to "Гамбия",
        "gana" to "Гана",
        "gvadelupa" to "Гваделупа",
        "gvatemala" to "Гватемала",
        "gvineya" to "Гвинея",
        "gvineya-bisau" to "Гвинея-Бисау",
        "germaniya" to "Германия",
        "germaniya-gdr" to "Германия (ГДР)",
        "germaniya-frg" to "Германия (ФРГ)",
        "gibraltar" to "Гибралтар",
        "gonduras" to "Гондурас",
        "gonkong" to "Гонконг",
        "grenada" to "Гренада",
        "grenlandiya" to "Гренландия",
        "greciya" to "Греция",
        "gruziya" to "Грузия",
        "guam" to "Гуам",
        "daniya" to "Дания",
        "dominika" to "Доминика",
        "dominikana" to "Доминикана",
        "egipet" to "Египет",
        "zair" to "Заир",
        "zambiya" to "Замбия",
        "zapadnaya-sahara" to "Западная Сахара",
        "zimbabve" to "Зимбабве",
        "izrail" to "Израиль",
        "indiya" to "Индия",
        "indoneziya" to "Индонезия",
        "iordaniya" to "Иордания",
        "irak" to "Ирак",
        "iran" to "Иран",
        "irlandiya" to "Ирландия",
        "islandiya" to "Исландия",
        "ispaniya" to "Испания",
        "italiya" to "Италия",
        "jemen" to "Йемен",
        "kabo-verde" to "Кабо-Верде",
        "kazahstan" to "Казахстан",
        "kajmanovy-ostrova" to "Каймановы острова",
        "kambodzha" to "Камбоджа",
        "kamerun" to "Камерун",
        "kanada" to "Канада",
        "katar" to "Катар",
        "keniya" to "Кения",
        "kipr" to "Кипр",
        "kirgiziya" to "Киргизия",
        "kiribati" to "Кирибати",
        "kitaj" to "Китай",
        "kolumbiya" to "Колумбия",
        "komory" to "Коморы",
        "kongo" to "Конго",
        "kongo-drk" to "Конго (ДРК)",
        "koreya" to "Корея",
        "koreya-severnaya" to "Корея Северная",
        "koreya-yuzhnaya" to "Корея Южная",
        "kosovo" to "Косово",
        "kosta-rika" to "Коста-Рика",
        "kot-divuar" to "Кот-д’Ивуар",
        "kuba" to "Куба",
        "kuvejt" to "Кувейт",
        "laos" to "Лаос",
        "latviya" to "Латвия",
        "lesoto" to "Лесото",
        "liberiya" to "Либерия",
        "livan" to "Ливан",
        "liviya" to "Ливия",
        "litva" to "Литва",
        "lihtenshtejn" to "Лихтенштейн",
        "lyuksemburg" to "Люксембург",
        "mavrikij" to "Маврикий",
        "mavritaniya" to "Мавритания",
        "madagaskar" to "Мадагаскар",
        "makao" to "Макао",
        "makedoniya" to "Македония",
        "malavi" to "Малави",
        "malajziya" to "Малайзия",
        "mali" to "Мали",
        "maldivy" to "Мальдивы",
        "malta" to "Мальта",
        "marokko" to "Марокко",
        "martinika" to "Мартиника",
        "marshallovy-ostrova" to "Маршалловы острова",
        "meksika" to "Мексика",
        "mozambik" to "Мозамбик",
        "moldova" to "Молдова",
        "monako" to "Монако",
        "mongoliya" to "Монголия",
        "montserrat" to "Монтсеррат",
        "myanma" to "Мьянма",
        "namibiya" to "Намибия",
        "nepal" to "Непал",
        "niger" to "Нигер",
        "nigeriya" to "Нигерия",
        "niderlandy" to "Нидерланды",
        "nikaragua" to "Никарагуа",
        "novaya-zelandiya" to "Новая Зеландия",
        "novaya-kaledoniya" to "Новая Каледония",
        "norvegiya" to "Норвегия",
        "oae" to "ОАЭ",
        "okkupirovannaya-palestinskaya-territoriya" to "Оккупированная Палестинская территория",
        "oman" to "Оман",
        "ostrov-men" to "Остров Мэн",
        "ostrova-kuka" to "Острова Кука",
        "pakistan" to "Пакистан",
        "palau" to "Палау",
        "palestina" to "Палестина",
        "panama" to "Панама",
        "papua-novaya-gvineya" to "Папуа - Новая Гвинея",
        "paragvaj" to "Парагвай",
        "peru" to "Перу",
        "polsha" to "Польша",
        "portugaliya" to "Португалия",
        "puerto-riko" to "Пуэрто Рико",
        "reyunon" to "Реюньон",
        "rossijskaya-imperiya" to "Российская империя",
        "rossiya" to "Россия",
        "ruanda" to "Руанда",
        "rumyniya" to "Румыния",
        "sssr" to "СССР",
        "ssha" to "США",
        "salvador" to "Сальвадор",
        "samoa" to "Самоа",
        "san-marino" to "Сан-Марино",
        "saudovskaya-araviya" to "Саудовская Аравия",
        "svazilend" to "Свазиленд",
        "severnaya-makedoniya" to "Северная Македония",
        "sejshelskie-ostrova" to "Сейшельские острова",
        "senegal" to "Сенегал",
        "sent-vinsent-i-grenadiny" to "Сент-Винсент и Гренадины",
        "sent-lyusiya" to "Сент-Люсия",
        "serbiya" to "Сербия",
        "serbiya-i-chernogoriya" to "Сербия и Черногория",
        "siam" to "Сиам",
        "singapur" to "Сингапур",
        "siriya" to "Сирия",
        "slovakiya" to "Словакия",
        "sloveniya" to "Словения",
        "somali" to "Сомали",
        "sudan" to "Судан",
        "surinam" to "Суринам",
        "serra-leone" to "Сьерра-Леоне",
        "tadzhikistan" to "Таджикистан",
        "tailand" to "Таиланд",
        "tajvan" to "Тайвань",
        "tanzaniya" to "Танзания",
        "timor-leste" to "Тимор-Лесте",
        "togo" to "Того",
        "tonga" to "Тонга",
        "trinidad-i-tobago" to "Тринидад и Тобаго",
        "tuvalu" to "Тувалу",
        "tunis" to "Тунис",
        "turkmenistan" to "Туркменистан",
        "turciya" to "Турция",
        "uganda" to "Уганда",
        "uzbekistan" to "Узбекистан",
        "ukraina" to "Украина",
        "urugvaj" to "Уругвай",
        "farerskie-ostrova" to "Фарерские острова",
        "federativnye-shtaty-mikronezii" to "Федеративные Штаты Микронезии",
        "fidzhi" to "Фиджи",
        "filippiny" to "Филиппины",
        "finlyandiya" to "Финляндия",
        "franciya" to "Франция",
        "francuzskaya-gviana" to "Французская Гвиана",
        "francuzskaya-polineziya" to "Французская Полинезия",
        "horvatiya" to "Хорватия",
        "car" to "ЦАР",
        "chad" to "Чад",
        "chernogoriya" to "Черногория",
        "chehiya" to "Чехия",
        "chehoslovakiya" to "Чехословакия",
        "chili" to "Чили",
        "shvejcariya" to "Швейцария",
        "shveciya" to "Швеция",
        "shri-lanka" to "Шри-Ланка",
        "ekvador" to "Эквадор",
        "ekvatorialnaya-gvineya" to "Экваториальная Гвинея",
        "eritreya" to "Эритрея",
        "estoniya" to "Эстония",
        "efiopiya" to "Эфиопия",
        "yuar" to "ЮАР",
        "yugoslaviya" to "Югославия",
        "yugoslaviya-fr" to "Югославия (ФР)",
        "yamajka" to "Ямайка",
        "yaponiya" to "Япония"
    )
}
