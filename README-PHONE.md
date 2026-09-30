# Bale Python Studio — Real Runtime

این نسخه بر پایه Chaquopy ساخته شده و Python را داخل اپ Android اجرا می‌کند.
Chaquopy یک SDK برای ادغام Python با Android است.

## امکانات این نسخه
- Python runtime واقعی داخل APK
- انتخاب baleio یا python-bale-bot
- اجرای pip از داخل Python runtime
- اجرای کد bot.py
- نمایش خروجی/خطای Python

## نکته مهم
سازگاری یک پکیج با Android تضمین‌شده نیست. Chaquopy از بسیاری از پکیج‌های pure-Python پشتیبانی می‌کند و برای بعضی پکیج‌های native باید wheel/نسخه سازگار Android وجود داشته باشد.

## ساخت
این پروژه برای build با Gradle/Android toolchain آماده شده است. اگر ساخت APK روی گوشی انجام نشود، باید build در یک محیط build ابری/کامپیوتر انجام شود.
