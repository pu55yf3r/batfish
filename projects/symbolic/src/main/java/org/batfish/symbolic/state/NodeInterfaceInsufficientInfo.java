package org.batfish.symbolic.state;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class NodeInterfaceInsufficientInfo extends InterfaceStateExpr {

  public NodeInterfaceInsufficientInfo(String hostname, String iface) {
    super(hostname, iface);
  }

  @Override
  public <R> R accept(StateExprVisitor<R> visitor) {
    return visitor.visitNodeInterfaceInsufficientInfo(this);
  }
}
