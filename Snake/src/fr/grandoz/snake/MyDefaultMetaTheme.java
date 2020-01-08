package fr.grandoz.snake;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

class MyDefaultMetalTheme extends DefaultMetalTheme {
  public ColorUIResource getWindowTitleInactiveBackground() {
    return new ColorUIResource(java.awt.Color.blue);
  }

  public ColorUIResource getWindowTitleBackground() {
    return new ColorUIResource(java.awt.Color.orange);
  }

  public ColorUIResource getPrimaryControlHighlight() {
    return new ColorUIResource(java.awt.Color.orange);
  }

  public ColorUIResource getPrimaryControlDarkShadow() {
    return new ColorUIResource(java.awt.Color.orange);
  }

  public ColorUIResource getPrimaryControl() {
    return new ColorUIResource(java.awt.Color.orange);
  }

  public ColorUIResource getControlHighlight() {
    return new ColorUIResource(java.awt.Color.orange);
  }

  public ColorUIResource getControlDarkShadow() {
    return new ColorUIResource(java.awt.Color.orange);
  }

  public ColorUIResource getControl() {
    return new ColorUIResource(java.awt.Color.orange);
  }
}