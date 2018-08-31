/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.versioning.util.projects;

import org.netbeans.modules.versioning.util.projects.ProjectOpener.ProjectOpenerType;

/**
 *
 * @author  Petr Kuzel
 */
final class CheckoutCompletedPanel extends javax.swing.JPanel {
    private final ProjectOpenerType type;

    /** Creates new form CheckoutCompletedPanel */
    CheckoutCompletedPanel(ProjectOpener.ProjectOpenerType type) {
        this.type = type;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, type.getMessage("BK3001"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 3, 0);
        add(jLabel1, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(cbOpenInFavorites, org.openide.util.NbBundle.getMessage(CheckoutCompletedPanel.class, "CheckoutCompletedPanel.cbOpenInFavorites")); // NOI18N
        cbOpenInFavorites.setToolTipText(org.openide.util.NbBundle.getMessage(CheckoutCompletedPanel.class, "CLONE_CheckoutCompletedPanel.cbOpenInFavorites.TT")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 0);
        add(cbOpenInFavorites, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(openButton, org.openide.util.NbBundle.getMessage(CheckoutCompletedPanel.class, "BK3003")); // NOI18N
        openButton.setToolTipText(type.getMessage("TT_OpenProject"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 3);
        add(openButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(createButton, org.openide.util.NbBundle.getMessage(CheckoutCompletedPanel.class, "BK3004")); // NOI18N
        createButton.setToolTipText(type.getMessage("TT_CreateProject"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        add(createButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(closeButton, org.openide.util.NbBundle.getMessage(CheckoutCompletedPanel.class, "BK3005")); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/netbeans/modules/versioning/util/projects/Bundle"); // NOI18N
        closeButton.setToolTipText(bundle.getString("TT_Close")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        add(closeButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    final javax.swing.JCheckBox cbOpenInFavorites = new javax.swing.JCheckBox();
    final javax.swing.JButton closeButton = new javax.swing.JButton();
    final javax.swing.JButton createButton = new javax.swing.JButton();
    final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    final javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    final javax.swing.JButton openButton = new javax.swing.JButton();
    // End of variables declaration//GEN-END:variables
}