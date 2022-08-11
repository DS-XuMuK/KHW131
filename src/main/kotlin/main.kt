fun main() {
    println(agoToText(1800000))
}

fun agoToText(seconds: Int): String {
    val result = when (seconds) {
        in 0..60 -> "������ ���"
        in 61..60 * 60 -> minutesToText(seconds / 60)
        in 60 * 60 + 1..24 * 60 * 60 -> hoursToText(seconds / (60 * 60))
        in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> "�������"
        in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> "�����"
        else -> "�����"
    }
    return "���(�) $result"
}

fun minutesToText(min: Int) = when (min) {
    1, 21, 31, 41, 51 -> "$min ������ �����"
    in 5..20, in 25..30, in 35..40, in 45..50, in 55..60 -> "$min ����� �����"
    else -> "$min ������ �����"
}

fun hoursToText(hour: Int) = when (hour) {
    1, 21 -> "$hour ��� �����"
    in 5..20 -> "$hour ����� �����"
    else -> "$hour ���� �����"
}