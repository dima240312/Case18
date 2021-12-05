fun main() {
    Case18()
}

fun Case18() {
    println(
        "Case18. Дано целое число в диапазоне 100–99.\n" +
                "Вывести строку-описание данного числа,\n" +
                "например:\n" +
                "256 — «двести пятьдесят шесть»,\n" +
                "814 — «восемьсот четырнадцать».\n"
    )

    var stroka_opisAnie = ""

    print("Введите число [1-99]: ")
    var number = readLine()!!.toInt()

    if (number in 1..99) {
        println("Всё ОК!")
        when (number / 10) //десятки
        {
            1 -> {
                when (number) {
                    10 -> stroka_opisAnie += "Десять"
                    11 -> stroka_opisAnie += "Одинадцать"
                    12 -> stroka_opisAnie += "Двенадцать"
                    13 -> stroka_opisAnie += "Тринадцать"
                    14 -> stroka_opisAnie += "Четырнадцать"
                    15 -> stroka_opisAnie += "Пятнадцать"
                    16 -> stroka_opisAnie += "Шестнадцать"
                    17 -> stroka_opisAnie += "Семнадцать"
                    18 -> stroka_opisAnie += "Восемнадцать"
                    19 -> stroka_opisAnie += "Девятнадцать"
                }
            }
            2 -> stroka_opisAnie += "Двадцать "
            3 -> stroka_opisAnie += "Тридцать "
            4 -> stroka_opisAnie += "Сорок "
            5 -> stroka_opisAnie += "Пятьдесят "
            6 -> stroka_opisAnie += "Шестьдесят "
            7 -> stroka_opisAnie += "Семьдесят "
            8 -> stroka_opisAnie += "Восемьдесят "
            9 -> stroka_opisAnie += "Девяносто "
        }
        if (number in 10..19) {
        } else {
            when (number % 10)//единицы
            {
                1 -> stroka_opisAnie += "Один"
                2 -> stroka_opisAnie += "Два"
                3 -> stroka_opisAnie += "Три"
                4 -> stroka_opisAnie += "Четыре"
                5 -> stroka_opisAnie += "Пять"
                6 -> stroka_opisAnie += "Шесть"
                7 -> stroka_opisAnie += "Семь"
                8 -> stroka_opisAnie += "Восемь"
                9 -> stroka_opisAnie += "Девять"
            }
        }
    } else {
        println("А кто условие читать будет? А?")
    }
    println(stroka_opisAnie)
}