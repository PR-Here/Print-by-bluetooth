package com.pankajrana.demoprint

import android.graphics.Bitmap
import com.mazenrashed.printooth.data.PrintingImagesHelper
import com.woosim.printer.WoosimImage

class pankajPrintingImagesHelper : PrintingImagesHelper {
    override fun getBitmapAsByteArray(bitmap: Bitmap): ByteArray {
        return WoosimImage.printRGBbitmap(0, 0, 384, bitmap.height, bitmap)
    }

}