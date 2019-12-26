# AndroLib
## How to create a jitpack.io library
1: create normal project
2: create a module library where the code will reside
3: follow instruction below to add library to new project


## How to use Basic
Add it to your build.gradle with:

allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}

and:

dependencies {
    compile 'com.github.jitpack:android-example:{latest version}'
}


### SW_Dialog module
as of version 0.0.2
Activity using the module show implement the filterInterface and pass itself as instance , as well as html text, which
normally to be found in res/raw folder(as R.raw.id_to_html).

ex:   InfoDialog.showCustomDialog(this, R.raw.demo_text);


### reminders:
https://jitpack.io/com/github/Nixxxxxxx/AndroLib/0.0.3/build.log
git push -u origin master
