# AndroidWebRTC
Checkout step by step tutorial.

https://medium.com/@shivammaindola07/step-by-step-guide-to-build-webrtc-native-android-app-47898caa1594


Start contributing to this project by forking it. Let's make it bigger together.

## Changes to run on your local wifi network
1. Open `VideoWebRTC/app/src/main/java/com/shivam/androidwebrtc/tutorial/CompleteActivity.java` and replace `"https://calm-badlands-59575.herokuapp.com/"` with the ip address of your webserver.
```bash
$ hostname -I
```

## Run
1. Install node
2. `$ cd SignalingServer && npm i && node index.js`
3. Open `VideoWebRTC` in Andriod Studio and run on your device
4. Open `http://localhost:3000` in your webbrowser from your computer

## Opening in the browser
1. You'll need a camera/webcam otherwise you'll receive a `navigators.mediaDevices is undefined` error
2. Likely the port will be `3000` instead of `8080` (ex: `localhost:3000`). This is set in `SignalingServer/index.js`
