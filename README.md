# helloJava

Note: to get tests running simply in IDEA:

https://stackoverflow.com/questions/19330832/setting-up-junit-with-intellij-idea

Adding JUnit library
Right-click your project and choose "Open Module Settings" or hit F4. (Alternatively, File > Project Structure, Ctrl-Alt-Shift-S is probably the "right" way to do this)
Go to the "Libraries" group, click the little green plus (look up), and choose "From Maven...".
Search for "junit" -- you're looking for something like "junit:junit:4.11".
Check whichever boxes you want (Sources, JavaDocs) then hit OK.
Keep hitting OK until you're back to the code.