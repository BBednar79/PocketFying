package desktopgui;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;


public class Keyboard implements KeyListener {
	
	//Data type to determine type of input
	enum EventType 
	{
		PRESSED, RELEASED, TYPED;
	}

	/**
	 *	Handles packaging the type of event for processing lists.
	 */
	class Event 
	{
		KeyEvent event;
		EventType type;

		public Event(KeyEvent event, EventType type) 
		{
			this.event = event;
			this.type = type;
		}
	}
	
	//Events waiting to be processed
	private LinkedList<Event> eventThread = new LinkedList<Event>();
	//Events the game thread is currently working on
	private LinkedList<Event> gameThread = new LinkedList<Event>();
	private Event event = null;
	private int[] polled;


	public Keyboard() 
	{
		this.polled = new int[256];
	}

	/**
	 *	Returns true if keyCode is same as the current event in process
	 *	and that key has been polled at least once. If it is not the key
	 *	for current event or no poll, returns false.
	 */
	public boolean keyDown(int keyCode) 
	{
		return keyCode == event.event.getKeyCode() && polled[keyCode] > 0;
	}
	
	/**
	 * 	Returns true if keyCode is same as the current event in process
	 *	and that key has been polled exactly once.
	 */
	public boolean keyDownOnce(int keyCode) 
	{
		return keyCode == event.event.getKeyCode() && polled[keyCode] == 1;
	}
	
	/**
	 * Swaps the eventThread (waiting) to the gameThread (in queue to process)
	 * so they can be processed by game thread.
	 */
	public synchronized void poll() 
	{
		LinkedList<Event> swap = eventThread;
		eventThread = gameThread;
		gameThread = swap;
	}

	
	/**
	 * 	Processes the first event in game thread's list of events. Returns
	 *	true if there are still events left to process.
	 *	No boolean[] keys here, handled by the two linked list of events
	 */
	public boolean processEvent() 
	{
		//Removes and returns first item of linked list
		// - Removes first event in game thread list
		// - Sets that event to the 'event', current
		//	 event being processed.
		//
		event = gameThread.poll();
		//Check if there are events
		if (event != null) 
		{
			int keyCode = event.event.getKeyCode();
			//Original poll() from KeyboardInput
			if (keyCode >= 0 && keyCode < polled.length) 
			{
				//Count presses
				if (event.type == EventType.PRESSED) 
				{
					polled[keyCode]++;
				} 
				//Key released, reset press count
				else if (event.type == EventType.RELEASED) 
				{
					polled[keyCode] = 0;
				}
			}
		}
		return event != null;
	}

	/**
	 * Returns the Character that was typed
	 */
	public Character getKeyTyped() 
	{
		if (event.type != EventType.TYPED) {
			return null;
		} else {
			return event.event.getKeyChar();
		}
	}

	
	/**
	 * 	Adds the key that was pressed to the 
	 *	event thread to be processed later.
	 */
	public synchronized void keyPressed(KeyEvent e) 
	{
		eventThread.add(new Event(e, EventType.PRESSED));
	}

	/**
	 * 	Adds the key that was released to the 
	 *	event thread to be processed later.
	 */
	public synchronized void keyReleased(KeyEvent e) 
	{
		eventThread.add(new Event(e, EventType.RELEASED));
	}
	
	/**
	 * 	Adds the key that was typed to the
	 *	event thread to be processed later.
	 *	NOTE: KeyTyped only works for characters.
	 */
	public synchronized void keyTyped(KeyEvent e) {
		eventThread.add(new Event(e, EventType.TYPED));
	}
}

