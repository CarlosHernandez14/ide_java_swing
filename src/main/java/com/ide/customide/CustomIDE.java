/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ide.customide;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.github.weisj.darklaf.DarkLaf;
import com.ide.views.HomeWindow;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.github.weisj.darklaf.extensions.rsyntaxarea.DarklafRSyntaxTheme;
import com.github.weisj.darklaf.theme.laf.DarculaThemeDarklafLookAndFeel;
import com.github.weisj.darklaf.theme.laf.ThemedLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class CustomIDE {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            UIManager.setLookAndFeel(new DarculaThemeDarklafLookAndFeel());
            // (opcional) seleccionar un tema específico:
            // LafManager.setTheme(LafManager.getInstalledThemes().get(0));
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CustomIDE.class.getName()).log(Level.SEVERE, null, ex);
        }

        // 2. Crear y mostrar tu ventana
        SwingUtilities.invokeLater(() -> {
            new HomeWindow().setVisible(true);
        });

    }
}
