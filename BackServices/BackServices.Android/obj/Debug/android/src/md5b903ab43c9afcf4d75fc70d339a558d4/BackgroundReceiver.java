package md5b903ab43c9afcf4d75fc70d339a558d4;


public class BackgroundReceiver
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("BackServices.Droid.BackgroundReceiver, BackServices.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BackgroundReceiver.class, __md_methods);
	}


	public BackgroundReceiver () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BackgroundReceiver.class)
			mono.android.TypeManager.Activate ("BackServices.Droid.BackgroundReceiver, BackServices.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
