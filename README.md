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
as of version 0.0.4

ex:   InfoDialog.showCustomDialog(this, R.raw.demo_text);
this-> Activity

### reminders:
https://jitpack.io/com/github/Nixxxxxxx/AndroLib/0.0.3/build.log
git push -u origin master


### Using PostRequest
Add to gradle
implementation 'com.google.code.gson:gson:2.8.2'

simple implementation of on success
ex:    public void OnSuccess(JSONArray jsonArray) {
        Gson gson = new Gson();
        Eventin[] events = gson.fromJson(jsonArray.toString(), Eventin[].class);
        for (int i = 0; i < events.length; i++) {
            Log.i("POSTREQUEST", events[i].title + " xzxxzx " + events[i].id + " -->" + events[i].image + " xzxxzx " + events[i].start + " -->" + events[i].author);
        }
    }