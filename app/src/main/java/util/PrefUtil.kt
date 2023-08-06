package util

import android.content.Context
import androidx.preference.PreferenceManager
import com.example.clockapp.TimerActivity

class PrefUtil {
    companion object {

        fun getTimerLength(context: Context): Int {
            //placeholder
            return 1
        }

        private const val PREVIOUS_TIMER_LENGTH_SECONDS_ID_TIMER= "com.example.clock-app.previous_timer_length"
        fun getPreviousTimerLengthSeconds(context: Context): Long{
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val PREVIOUS_TIMER_LENGTH_SECONDS_ID = ""
            var defValue = 0
            return preferences.getLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, defValue.toLong())
        }
        fun setPreviousTimerLengthSeconds(seconds: Long, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            val PREVIOUS_TIMER_LENGTH_SECONDS_ID=""
            editor.putLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, seconds)
            editor.apply()
        }
            private const val TIMER_STATE_ID= "com.example.clockapp.timer_state"
            fun getTimerState(context: Context):TimerActivity.TimerState{
                val preferences = PreferenceManager.getDefaultSharedPreferences(context)
                var defValue = 0
                val ordinal = preferences.getInt(TIMER_STATE_ID, defValue.toLong().toInt())
                return TimerActivity.TimerState.values()[ordinal]
            }
        fun setTimerState(state: TimerActivity.TimerState, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            val ordinal =  state.ordinal
            editor.putInt(TIMER_STATE_ID,ordinal)
            editor.apply()
        }

        fun getSecondsRemaining(timerActivity: TimerActivity): Long {
            TODO("Not yet implemented")
        }

        private const val SECONDS_REMAINING_ID= "com.example.clockapp.previous_timer_length"
    }

    fun setPreviousTimerLengthSeconds(seconds: Long, context: Context) {
        val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
        editor.putLong(SECONDS_REMAINING_ID, seconds)
        editor.apply()
    }

    fun getPreviousTimerLengthSeconds(context: Context): Long{
        val preferences = PreferenceManager.getDefaultSharedPreferences(context)
        var defValue = 0
        return preferences.getLong(SECONDS_REMAINING_ID, defValue.toLong())
    }
}