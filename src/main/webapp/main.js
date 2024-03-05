import { initializeApp } from "https://www.gstatic.com/firebasejs/10.8.1/firebase-app.js";
import { getAuth, GoogleAuthProvider , signInWithPopup} from "https://www.gstatic.com/firebasejs/10.8.1/firebase-auth.js";
  const firebaseConfig = {
    apiKey: "AIzaSyBqlQS27r--12dSRKiTKJ8yrOhGCTVd2Ks",
    authDomain: "hospital1-6be3c.firebaseapp.com",
    projectId: "hospital1-6be3c",
    storageBucket: "hospital1-6be3c.appspot.com",
    messagingSenderId: "772784902497",
    appId: "1:772784902497:web:9394913ff3141019f6b520"
  };
 

  const app = initializeApp(firebaseConfig);
  
	const auth = getAuth(app);
	auth.languageCode = 'en';
  const provider = new GoogleAuthProvider();
  const googleLogin = document.getElementById("google-login-btn");
  googleLogin.addEventListener("click", function(){
	signInWithPopup(auth, provider)
  .then((result) => {
    
    const credential = GoogleAuthProvider.credentialFromResult(result);
/*    const token = credential.accessToken;*/
   
    const user = result.user;
   
  }).catch((error) => {
   
    const errorCode = error.code;
    const errorMessage = error.message;
    
  /*  const email = error.customData.email;
  const credential = GoogleAuthProvider.credentialFromError(error);
   */
  });
})
