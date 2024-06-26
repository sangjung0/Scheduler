package org.study;

import org.study.scheduler.*;

import java.awt.*;

public class Constants {

    // ----- Main -----
    public static final int WINDOW_X = 1000;
    public static final int WINDOW_Y = 1000;
    public static final int WINDOW_WIDTH = 900;
    public static final int WINDOW_HEIGHT = 900;
    public static final int FRAME_PADDING = 20;
    public static final String TITLE = "Scheduler";

    public static final int THREE_LABEL_H_GAP = 30;

    // ----- Scheduler --------
    public static final int SCHEDULER_MULTILEVEL_FEEDBACK_QUEUE_Q1_TIME_QUANTUM = 8;
    public static final int SCHEDULER_MULTILEVEL_FEEDBACK_QUEUE_Q2_TIME_QUANTUM = 16;
    public static final int SCHEDULER_MULTILEVEL_FEEDBACK_QUEUE_Q1 = 1;
    public static final int SCHEDULER_MULTILEVEL_FEEDBACK_QUEUE_Q2 = 2;
    public static final int SCHEDULER_MULTILEVEL_FEEDBACK_QUEUE_Q3 = 3;

    public static final int SCHEDULER_MULTILEVEL_QUEUE_CRITERION = 15;
    public static final int SCHEDULER_MULTILEVEL_QUEUE_RR_TIME_RATIO = 8;
    public static final int SCHEDULER_MULTILEVEL_QUEUE_FCFS_TIME_RATIO = 2;

    public static final int SCHEDULER_ROUND_ROBIN_TIME_QUANTUM = 8;

    public static final int SCHEDULER_SRTF_TIME_QUANTUM = 1;

    // ----- Process --------
    public static final String PROCESS_WAIT = "WAIT";

    // ----- Bar Chart ------
    public static final String BAR_CHART_NAME = "Average Bar Chart";
    public static final String BAR_CHART_X_AXIS = "Scheduler Name";
    public static final String BAR_CHART_Y_AXIS = "Time";
    public static final String BAR_CHART_WAITING_TIME = "Waiting Time";
    public static final String BAR_CHART_TURNAROUND_TIME = "Turnaround Time";
    public static final String BAR_CHART_RESPONSE_TIME = "Response Time";

    // ----- Button -------
    public static final float BUTTON_FONT_SIZE = 15.0F;
    public static final String BUTTON_ALL_RUN = "All Run";
    public static final String BUTTON_CHART_CLEAR= "Chart Clear";
    public static final String BUTTON_OPEN_FILE= "Open File";
    public static final String BUTTON_RUN= "Run";
    public static final String BUTTON_RANDOM = "Completely Random";
    public static final String BUTTON_INPUT_CLEAR = "Input Clear";
    public static final String BUTTON_OUTPUT_CLEAR = "Output Clear";
    public static final String BUTTON_LONG_BURST_RANDOM = "Long Burst Random";
    public static final String BUTTON_SHORT_BURST_RANDOM = "Short Burst Random";
    public static final String BUTTON_CLEAR = "Clear";

    // ----- Label ------
    public static final float LABEL_FONT_SIZE = 15.0F;
    public static final String LABEL_AVERAGE_WAITING_TIME = "average waiting time";
    public static final String LABEL_CONTEXT_SWITCHING_COUNT = "context switching count";
    public static final String LABEL_TOTAL_EXECUTION_TIME = "total execution time";
    public static final String LABEL_INPUT = "input";
    public static final String LABEL_OUTPUT= "output";

    // ----- Table -----
    public static final float TABLE_FONT_SIZE = 15.0F;
    public static final int TABLE_HEIGHT = 22;
    public static final String TABLE_COLUMN_PROCESS = "Process";
    public static final String TABLE_COLUMN_ARRIVAL_TIME = "ArrivalTime";
    public static final String TABLE_COLUMN_BURST_TIME = "BurstTime";
    public static final String TABLE_COLUMN_EXECUTION_TIME = "ExecutionTime";
    public static final String TABLE_COLUMN_PRIORITY = "Priority";
    public static final String TABLE_COLUMN_WAITING_TIME= "WaitingTime";
    public static final String TABLE_COLUMN_TURNAROUND_TIME= "TurnaroundTime";
    public static final String TABLE_COLUMN_RESPONSE_TIME= "ResponseTime";
    public static final String TABLE_REMOVE = "Remove";
    public static final String TABLE_ADD = "Add";
    public static final String[] INPUT_TABLE_COLUMNS_SUMMARY = {
            TABLE_COLUMN_PROCESS,
            TABLE_COLUMN_ARRIVAL_TIME,
            TABLE_COLUMN_BURST_TIME,
            TABLE_COLUMN_PRIORITY
    };
    public static final String[] OUTPUT_TABLE_COLUMNS_SUMMARY = {
            TABLE_COLUMN_PROCESS,
            TABLE_COLUMN_EXECUTION_TIME,
            TABLE_COLUMN_WAITING_TIME,
            TABLE_COLUMN_TURNAROUND_TIME,
            TABLE_COLUMN_RESPONSE_TIME
    };

    // ----- Gant Chart -----
    public static final Color GANTT_CHART_COLOR = Color.RED;

    // ----- Scheduler Selector -----
    @SuppressWarnings("unchecked")
    public static final Class<? extends Scheduler>[] SCHEDULE_ALGORITHM = new Class[]{
            FCFS.class,
            HRRN.class,
            MultilevelFeedbackQueue.class,
            MultilevelQueue.class,
            RoundRobin.class,
            SJF.class,
            SRTF.class,
            GIRR.class
    };

    public static final String[] SCHEDULE_ALGORITHM_TOOLTIP = {
            "\nFirst In First Out (FIFO)\nFIFO scheduling algorithm assigns priority to processes in the order they arrive. It is simple and effective for jobs with similar demands.\n",
            "\nAging\nAging is a technique used to prevent starvation in scheduling. It gradually increases the priority of older tasks, ensuring that they get processed eventually.\n",
            "\nMultilevel Feedback Queue\nThis algorithm allows a process to move between different queues based on its behavior and requirement. It helps in efficiently managing CPU scheduling with a combination of aging and priority.\n",
            "\nMultilevel Queue\nMultilevel Queue scheduling assigns processes to different queues based on their priority level. Processes are permanently placed in one queue, typically based on the type of process.\n",
            "\nRound Robin\nRound Robin scheduling assigns a fixed time unit per process and cycles through them. It is especially effective for time-sharing systems.\n",
            "\nShortest Job First\nThis algorithm picks the process with the smallest execution time, which helps to minimize overall time for completion but can lead to starvation of longer processes.\n",
            "\nShortest Remaining Time First\nSimilar to Shortest Job First, this algorithm dynamically schedules tasks based on the shortest remaining time. It is more responsive but can be complex to implement.\n",
            "\nGradually Increasing Round Robin\nThis variation of Round Robin increases the time slice for processes incrementally, which can better accommodate processes that need more time to complete.\n"
    };

    // ----- Error Message -----

    public static final String ERROR_MESSAGE_BOX_TITLE = "Error";

    public static final String ARRIVAL_TIME_CANNOT_BE_NEGATIVE = "Arrival time cannot be negative";
    public static final String BURST_TIME_MUST_BE_GREATER_THEN_0 = "Burst time Must be grater than 0";
    public static final String RESPONSE_TIME_CANNOT_BE_NEGATIVE = "Response time cannot be negative";
    public static final String EXECUTION_TIME_CANNOT_BE_NEGATIVE = "Execution time Must be greater than 0";
    public static final String WAITING_TIME_CANNOT_BE_NEGATIVE = "Waiting time cannot be negative";
    public static final String TURNAROUND_TIME_CANNOT_BE_NEGATIVE = "Turnaround time cannot be negative";
    public static final String FILE_DOES_NOT_EXIST = "File does Not exist.";
    public static final String FILE_CONTENT_FORMAT_IS_INCORRECT = "File content format is Incorrect.";
    public static final String RUN_ERROR = "Run Error.";


}
