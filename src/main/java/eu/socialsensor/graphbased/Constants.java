/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.socialsensor.graphbased;


/**
 *
 * @author gpetkos
 */
public class Constants {
    public static String SELECT_ALL_HASHTAGS = "SELECT_ALL_HASHTAGS";
    public static String SELECT_ALL_ENTITIES = "SELECT_ALL_ENTITIES";
    public static String TERM_SELECTION_METHOD="TERM_SELECTION_METHOD";
    public static String TERM_SELECTION_RATIO_THRESHOLD="TERM_SELECTION_RATIO_THRESHOLD";
    public static String TERM_SELECTION_TOP_N="TERM_SELECTION_TOP_N";
    public static String TERM_SELECTION_TOP_PERCENTAGE="TERM_SELECTION_TOP_PERCENTAGE";
    public static String MIN_TOPIC_SIZE="MIN_TOPIC_SIZE";
    public static String CORRELATION_SELECTION_TYPE="CORRELATION_SELECTION_TYPE";
    public static String CORRELATION_SELECTION_AVERAGE_DEGREE="CORRELATION_SELECTION_AVERAGE_DEGREE";
    public static String CORRELATION_THRESHOLD="CORRELATION_THRESHOLD";
    public static String CORRELATION_SELECTION_GLOBAL_N="CORRELATION_SELECTION_GLOBAL_N";
    public static String CORRELATION_SELECTION_GLOBAL_RATIO="CORRELATION_SELECTION_GLOBAL_RATIO";
    public static String CORRELATION_SELECTION_LOCAL_N="CORRELATION_SELECTION_LOCAL_N";
    public static String CORRELATION_SELECTION_LOCAL_RATIO="CORRELATION_SELECTION_LOCAL_RATIO";
    public static String SCAN_EPSILON="SCAN_EPSILON";
    public static String SCAN_MU="SCAN_MU";
    public static String HUB_LINKING_THRESHOLD="HUB_LINKING_THRESHOLD";
    public static String TERM_SIMILARITY_METHOD="TERM_SIMILARITY_METHOD";

    public static eu.socialsensor.topicdetection.BasicConfiguration configuration;
    
    
    public static enum TERM_SELECTION_TYPES {RATIO_THRESHOLD,TOP_N,TOP_PERCENTAGE};
    public static enum CORRELATION_SELECTION_TYPES {GLOBAL_PERCENTAGE,GLOBAL_N,LOCAL_PERCENTAGE,LOCAL_N,FULL,THRESHOLD,GLOBAL_AVERAGE_DEGREE};
    public static enum TERM_SIMILARITY_METHODS {NO_OF_COOCCURRENCES,NO_OF_COOCCURRENCES_REGULARIZED_MIN,NO_OF_COOCCURRENCES_REGULARIZED_MAX,NO_OF_COOCCURRENCES_REGULARIZED_SUM,NO_OF_COOCCURRENCES_REGULARIZED_TIMES,JACCARD,COSINE};
}
