package com.dino.test

import android.util.Log

object Utils {
    /**
     * 把字符串”20-2,21-0,22-0,23-6”
     * 以JSON格式输出为：{"20”:”2”,”21”:”0”,”22”:”0”,”23”:”6”}
     */
    fun formatString2Json(s: String): String {
        var jsonString = StringBuffer()
        var kvArray = s.split(",")
        jsonString.append("{")
        for (kv in kvArray) {
            var kvs = kv.split("-")
            if (kvs.size == 2) {
                jsonString.append("\"")
                jsonString.append(kvs[0])
                jsonString.append("\"")
                jsonString.append(":")
                jsonString.append("\"")
                jsonString.append(kvs[1])
                jsonString.append("\"")
                jsonString.append(",")
            }
        }
        if (jsonString.length > 1) jsonString.deleteCharAt(jsonString.length - 1)
        jsonString.append("}")
        return jsonString.toString()
    }

    /**
     * 一个细胞每半个小时分裂一次，一次分裂成两个，请问分裂到1000000个以上最少需要多长时间
     * 2的n次方
     * 运行结果10小时
     */
    fun splitTime(): Double {
        var gapTime = 0.5
        var count = 0.toDouble()
        while (true) {
            val t = Math.pow(2.0, count)
            if (t >= 1000000.toDouble()) {
                break
            }
            count++
        }
        return count * gapTime
    }

    /**
     * 计算一天24小时内，时针和分针重叠的次数和分别在几点
     *
     * 分针每分钟走6度，时针每分钟走0.5度。
     * 第一场比赛，都在12，所以不用追击。
     * 第二场，1：00，两者相距30度，故（30）/（6-0.5）
     * 第三场，2：00，两者相距60度，故（60）/（6-0.5）
     */
    fun overlapping() {
        var hour = 30
        for (count in 0 until 11) {
            //此处加上0.5是为了四舍五入
            var min = Math.round((((count * hour) / (6 - 0.5)) + 0.5) * 100) / 100
            Log.e("overlapping", "$count:$min")
        }
    }

    fun method3() {
        for (i in 0..24 * 60 * 60) {
            if ((6 * i) % 360 == ((0.1 * i) % 360).toInt()) {
                if ((0.1 * i) % 360 == (1 / 120.0) * i % 360) {
                    Log.e("overlapping", "${i / 3600} :  ${i % 3600 / 60} : ${i % 3600 % 60 / 60}")
                }
            }
        }
    }

}