# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# For RxJava:
-dontwarn org.junit.**

-dontwarn java.lang.invoke.*

-keepattributes InnerClasses,Signature,Exceptions,EnclosingMethod,SourceFile,LineNumberTable,*Annotation*
-renamesourcefileattribute SourceFile

# Retrofit, okhttp3
-keepattributes Signature
-keepattributes Annotation
-keep class okhttp3.* { *; }
-keep interface okhttp3.* { *; }
-dontwarn okhttp3.**

-dontwarn okio.**

-dontwarn retrofit2.**
-keep class retrofit2.** { *; }

-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
}

-keepattributes RuntimeVisibleAnnotations
-keepattributes RuntimeInvisibleAnnotations
-keepattributes RuntimeVisibleParameterAnnotations
-keepattributes RuntimeInvisibleParameterAnnotations
-keepattributes EnclosingMethod

-keepclasseswithmembers interface * {
    @retrofit2.* <methods>;
}

# Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.module.AppGlideModule
-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}

#keep line numbers in debug
-renamesourcefileattribute SourceFile
-keepattributes SourceFile,LineNumberTable

-printmapping proguard_outputfile.txt
