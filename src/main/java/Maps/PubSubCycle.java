package Maps;

import java.util.HashMap;
import java.util.Map;

class TopicPublisher {

    private final String topic;
    private final String publisher;
    
    private int hash;

    public TopicPublisher(String topic, String publisher) {
        this.topic = topic;
        this.publisher = publisher;
    }
    
    public String getTopic() {
        return topic;
    }
    
    public String getPubLisher() {
        return publisher;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (null == obj) {
            return false;
        }

        if (obj instanceof TopicPublisher) {
            TopicPublisher other = (TopicPublisher) obj;
            if (this.topic.equals(other.topic) && this.publisher.equals(other.publisher)) {

                return true;
            }

        }
        return false;
    }
    
    @Override
    public int hashCode() {
        
        int h = hash;
        if(h == 0) {
            
            if(null != topic) {
                
                h = 31*h + topic.hashCode();
            }
            if(null != publisher) {
                h = 31 * h + publisher.hashCode();
            }
            hash = h;
        }
        return h;
    }
}

public class PubSubCycle {
	
	public void notifyPublished(String publisher, String topic, String data) {

		Map<TopicPublisher, String> lookup = new HashMap<>();	   
        TopicPublisher tp = new TopicPublisher(topic, publisher);
        
        String lookupData = lookup.get(tp);
        
        if(lookupData == null) {
            
            lookup.put(tp, data);
            // case 3 & 4, notify all
        }
        else if(lookupData.equals(data)) {
            // case 2, ignore
            
        }
        else {
            // case 1, throw exception
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
