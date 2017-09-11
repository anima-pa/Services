using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace BackServices
{
    public partial class MainPage : ContentPage
    {
        public string before;
        public string after;
        public MainPage()
        {
            InitializeComponent();
            DateTime now = DateTime.Now.ToLocalTime();
            MessagingCenter.Subscribe<object, string>(this, "UpdateLabel", (s, e) =>
            {
                Device.BeginInvokeOnMainThread(() =>
                {
                    DisplayAlert("Alert After" ,e,"OK");
                });
            });
        }

        private void Button_Clicked(object sender, EventArgs e1)
        {
           /* MessagingCenter.Unsubscribe<object, string>(this, "UpdateLabel", (s, e) =>
            {
                DisplayAlert("UnSubcribed", e, "OK");
            });
            */
        }
    }
}
