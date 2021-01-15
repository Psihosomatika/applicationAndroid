const splash = document.querySelector('.splash');
document.addEventListener('DOMContentLoaded', (e)=>{
    setTimeout(()=>{
        splash.classList.add('display-none');
    }, 5000);
});
const ref = window.open('https://www.salesforce.com/products/platform/overview/', '_blank', 'location=yes');
document.addEventListener("deviceready", onDeviceReady, false);

function onDeviceReady() {
    window.open = cordova.InAppBrowser.open;
};
