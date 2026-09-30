# ساخت APK با GitHub Actions

1. یک Repository جدید در GitHub بساز.
2. تمام فایل‌های این پروژه را داخل Repository آپلود کن.
3. مطمئن شو فایل زیر وجود دارد:
   `.github/workflows/build-apk.yml`
4. وارد تب **Actions** شو.
5. Workflow با نام **Build Bale Python Studio APK** را باز کن.
6. اگر خواستی دستی اجرا کنی، **Run workflow** را بزن.
7. بعد از پایان Build، وارد اجرای موفق Workflow شو.
8. در قسمت **Artifacts** فایل `BalePythonStudio-debug-apk` را دانلود کن.
9. ZIP مربوط به Artifact را باز کن و APK را روی گوشی نصب کن.

نکته:
این Workflow نسخه Debug APK می‌سازد. برای انتشار عمومی، بعداً signing/release را جداگانه اضافه می‌کنیم.

اگر Build خطا داد، متن خطای Actions را بفرست تا Workflow یا پروژه را اصلاح کنیم.
