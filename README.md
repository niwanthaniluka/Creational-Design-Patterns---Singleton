# Java Singleton Design Patterns - Hands On 🚀

මෙම ව්‍යාපෘතිය මඟින් **Object-Oriented Design Patterns** යටතේ එන **Singleton Pattern** එක ප්‍රායෝගිකව (Hands-on) ක්‍රියාත්මක කරන ප්‍රධාන ක්‍රම 5ක් නිරූපණය කරයි.Singleton රටාව භාවිතා කරන්නේ යම් Class එකකින් සෑදිය හැක්කේ එක් වස්තුවක් (Single Instance) පමණක් බව සහතික කිරීමට සහ එයට ගෝලීය ප්‍රවේශයක් (Global Access Point) ලබා දීමටයි.

---

## 🏗️ Singleton ක්‍රියාත්මක කිරීමේ පියවර (Implementation Details)

Singleton රටාවක් නිර්මාණය කිරීමේදී අත්‍යවශ්‍ය මූලධර්ම 3ක් අනුගමනය කර ඇත.
1. **Private Constructor**: වෙනත් Class වලට අලුතින් Object සෑදීම වැළැක්වීමට.
2. **Private Static Variable**: එම Class එකේම වර්ගයේ එකම Object එක රඳවා ගැනීමට.
3. **Public Static Method**: එම Object එක ලබා ගැනීමට ඇති එකම ගෝලීය දොරටුව (Global Access Point) ලෙස ක්‍රියා කිරීමට.

---

## 📚 අන්තර්ගතය (Implementation Methods)

පහත දැක්වෙන සෑම ක්‍රමයකදීම `Printer` class එක භාවිතා කරමින් Singleton රටාව ක්‍රියාත්මක කර ඇත.

1. Eager Initialization.
Class එක load වන විටම Object එක සාදනු ලබයි. මෙය සරල වන අතර Thread-safe වේ.

2. Static Block Initialization.
Eager ක්‍රමයට සමාන වන අතර මෙහිදී `static block` එකක් තුළ Object එක සාදයි. මෙය Object එක සෑදීමේදී සිදුවන දෝෂ පාලනය කිරීමට (Exception Handling) උපකාරී වේ.

3. Lazy Initialization.
වැඩසටහන තුළ ප්‍රථම වතාවට Object එකක් ඉල්ලා සිටින විට පමණක් එය නිර්මාණය කරයි. මෙය මතකය (Memory) ඉතිරි කිරීමට උපකාරී වේ.

4. Thread Safe Singleton.
Multi-threaded පරිසරයකදී පවා එක් Object එකක් පමණක් පවතින බව සහතික කිරීමට `synchronized` කීවර්ඩ් එක භාවිතා කරයි.

5. Bill Pugh Singleton Implementation.
Inner static helper class එකක් භාවිතා කරයි. මෙය `synchronized` භාවිතයෙන් තොරව ආරක්ෂිතව සහ කාර්යක්ෂමව Singleton සාදන වඩාත් නිර්දේශිත ක්‍රමයයි.

---

## 🛠️ පරීක්ෂා කර බලන ආකාරය (How to Test)

1. ඔබේ පරිගණකයේ **IntelliJ IDEA** ස්ථාපනය කර තිබිය යුතුය.
2. මෙම ව්‍යාපෘතිය පූරණය කර එක් එක් Package එකේ ඇති `Main.java` ගොනුව Run කරන්න.
3. ලැබෙන Output එකේ HashCode අගයන් පරීක්ෂා කරන්න:
   - **HashCode අගයන් සමාන නම්**: Singleton රටාව නිවැරදිව ක්‍රියාත්මක වේ.
   - **HashCode අගයන් වෙනස් නම්**: Singleton රටාවේ දෝෂයක් පවතී.


