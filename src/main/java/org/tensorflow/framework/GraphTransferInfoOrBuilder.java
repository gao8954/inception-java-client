// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graph_transfer_info.proto

package org.tensorflow.framework;

public interface GraphTransferInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphTransferInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;</code>
   */
  java.util.List<org.tensorflow.framework.GraphTransferInfo.NodeInfo> 
      getNodeInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.NodeInfo getNodeInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;</code>
   */
  int getNodeInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;</code>
   */
  java.util.List<? extends org.tensorflow.framework.GraphTransferInfo.NodeInfoOrBuilder> 
      getNodeInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.NodeInfoOrBuilder getNodeInfoOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;</code>
   */
  java.util.List<org.tensorflow.framework.GraphTransferInfo.ConstNodeInfo> 
      getConstNodeInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.ConstNodeInfo getConstNodeInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;</code>
   */
  int getConstNodeInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;</code>
   */
  java.util.List<? extends org.tensorflow.framework.GraphTransferInfo.ConstNodeInfoOrBuilder> 
      getConstNodeInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.ConstNodeInfoOrBuilder getConstNodeInfoOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;</code>
   */
  java.util.List<org.tensorflow.framework.GraphTransferInfo.NodeInputInfo> 
      getNodeInputInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.NodeInputInfo getNodeInputInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;</code>
   */
  int getNodeInputInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;</code>
   */
  java.util.List<? extends org.tensorflow.framework.GraphTransferInfo.NodeInputInfoOrBuilder> 
      getNodeInputInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.NodeInputInfoOrBuilder getNodeInputInfoOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;</code>
   */
  java.util.List<org.tensorflow.framework.GraphTransferInfo.NodeOutputInfo> 
      getNodeOutputInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.NodeOutputInfo getNodeOutputInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;</code>
   */
  int getNodeOutputInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;</code>
   */
  java.util.List<? extends org.tensorflow.framework.GraphTransferInfo.NodeOutputInfoOrBuilder> 
      getNodeOutputInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.NodeOutputInfoOrBuilder getNodeOutputInfoOrBuilder(
      int index);

  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  java.util.List<org.tensorflow.framework.GraphTransferInfo.GraphInputNodeInfo> 
      getGraphInputNodeInfoList();
  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.GraphInputNodeInfo getGraphInputNodeInfo(int index);
  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  int getGraphInputNodeInfoCount();
  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  java.util.List<? extends org.tensorflow.framework.GraphTransferInfo.GraphInputNodeInfoOrBuilder> 
      getGraphInputNodeInfoOrBuilderList();
  /**
   * <pre>
   * Input Node parameters of transferred graph
   * </pre>
   *
   * <code>repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.GraphInputNodeInfoOrBuilder getGraphInputNodeInfoOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  java.util.List<org.tensorflow.framework.GraphTransferInfo.GraphOutputNodeInfo> 
      getGraphOutputNodeInfoList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.GraphOutputNodeInfo getGraphOutputNodeInfo(int index);
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  int getGraphOutputNodeInfoCount();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  java.util.List<? extends org.tensorflow.framework.GraphTransferInfo.GraphOutputNodeInfoOrBuilder> 
      getGraphOutputNodeInfoOrBuilderList();
  /**
   * <code>repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.GraphOutputNodeInfoOrBuilder getGraphOutputNodeInfoOrBuilder(
      int index);

  /**
   * <pre>
   * Destination of graph transfer
   * </pre>
   *
   * <code>.tensorflow.GraphTransferInfo.Destination destination = 7;</code>
   */
  int getDestinationValue();
  /**
   * <pre>
   * Destination of graph transfer
   * </pre>
   *
   * <code>.tensorflow.GraphTransferInfo.Destination destination = 7;</code>
   */
  org.tensorflow.framework.GraphTransferInfo.Destination getDestination();
}