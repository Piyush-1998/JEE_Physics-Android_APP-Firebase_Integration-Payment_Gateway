package com.pm161998.jeephysics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Questions_view_pdf_files extends AppCompatActivity {
    String[] ACName;
    String[] COMName;
    String[] CaliorimetryName;
    String[] CapacitanceName;
    List<String> ChildList;
    String[] CircularmotionName;
    String[] CurrentName;
    String[] EIName;
    String[] EWName;
    String[] ElectrostaticsName;
    String[] FMName;
    String[] FrictionName;
    String[] GOName;
    String[] GravitationName;
    String[] HTName;
    String[] KTGName;
    String[] MECName;
    String[] MPName;
    String[] MTName;
    String[] MeasurementName;
    String[] NLMName;
    String[] NPName;
    String[] PMName;
    String[] POCName;
    String[] PaidpdfName;
    List<String> ParentList;
    Map<String, List<String>> ParentListItems;
    String[] RBDName;
    String[] RMName;
    String[] RelativeMName;
    String[] SHMName;
    String[] SSName;
    String[] STName;
    String[] SWName;
    String[] SamplePaidpdfName;
    String[] UDName;
    String[] WOName;
    String[] WPName;
    String[] WaveName;
    String[] defaultName;
    ExpandableListView expandableListView;

    public Questions_view_pdf_files() {
        ArrayList arrayList = new ArrayList();
        this.ParentList = arrayList;
        arrayList.add("Sample Advanced Paid PDFs");
        this.ParentList.add("Paid PDFs");
        this.ParentList.add("Alternating Current");
        this.ParentList.add("Calorimetry & Thermal Expansion");
        this.ParentList.add("Capacitance");
        this.ParentList.add("Center of Mass");
        this.ParentList.add("Circular Motion");
        this.ParentList.add("Current Electricity");
        this.ParentList.add("Electromagnetic Induction");
        this.ParentList.add("Electromagnetic Wave");
        this.ParentList.add("Electrostatics");
        this.ParentList.add("Fluid Mechanics");
        this.ParentList.add("Friction");
        this.ParentList.add("Geometrical Optics");
        this.ParentList.add("Gravitation");
        this.ParentList.add("Heat Transfer");
        this.ParentList.add("KTG & Thermodynamics");
        this.ParentList.add("Magnetic Effect of Current");
        this.ParentList.add("Mathematical Tools");
        this.ParentList.add("Measurement Error & Experiment");
        this.ParentList.add("Modern Physics");
        this.ParentList.add("Newtons Law of Motion");
        this.ParentList.add("Nuclear Physics");
        this.ParentList.add("Principle Of Communication");
        this.ParentList.add("Projectile Motion");
        this.ParentList.add("Rectilinear Motion");
        this.ParentList.add("Relative Motion");
        this.ParentList.add("Rigid Body Dynamics");
        this.ParentList.add("Simple Harmonic Motion");
        this.ParentList.add("Solid & Semiconductor Devices");
        this.ParentList.add("Sound Wave");
        this.ParentList.add("Surface Tension");
        this.ParentList.add("Units & Dimension");
        this.ParentList.add("Wave on a String");
        this.ParentList.add("Wave Optics");
        this.ParentList.add("Work Power & Energy");
        this.SamplePaidpdfName = new String[]{"Sample_Calorimetry&ThermalExpansion_Advanced_Pdfs", "Sample_CurrentElectricity_Advanced_Pdfs", "Sample_FluidMechancis_Advanced_Pdfs", "Sample_MathematicalTools_Advanced_Pdfs", "Sample_MeasurementError_Advanced_Pdfs", "Sample_ProjectileMotion_Advanced_Pdfs", "Sample_POC_Advanced_Pdfs", "Sample_Units&Dimension_Advanced_Pdfs"};
        this.PaidpdfName = new String[]{"Advanced Question Pdfs - 1", "Advanced Question Pdfs - 2", "Advanced Question Pdfs - 3", "Advanced Question Pdfs - 4", "Advanced Question Pdfs - 5", "Advanced Question Pdfs - 6", "Advanced Question Pdfs - 7"};
        this.ACName = new String[]{"Simple_AlternatingCurrent_Ex_1", "Advanced_AlternatingCurrent_Ex_2", "Yearwise_AlternatingCurrent_Ex_3", "AlternatingCurrent_Solutions"};
        this.CaliorimetryName = new String[]{"Simple_Calorimetry&ThermalExpansion_Ex_1", "Advanced_Calorimetry&ThermalExpansion_Ex_2", "Yearwise_Calorimetry&ThermalExpansion_Ex_3", "Calorimetry&ThermalExpansion_Solutions"};
        this.CapacitanceName = new String[]{"Simple_Capacitance_Ex_1", "Advanced_Capacitance_Ex_2", "Yearwise_Capacitance_Ex_3", "Capacitance_Solutions"};
        this.COMName = new String[]{"Simple_CenterofMass_Ex_1", "Advanced_CenterofMass_Ex_2", "Yearwise_CenterofMass_Ex_3", "CenterofMass_Solutions"};
        this.CircularmotionName = new String[]{"Simple_CircularMotion_Ex_1", "Advanced_CircularMotion_Ex_2", "Yearwise_CircularMotion_Ex_3", "CircularMotion_Solutions"};
        this.CurrentName = new String[]{"Simple_CurrentElectricity_Ex_1", "Advanced_CurrentElectricity_Ex_2", "Yearwise_CurrentElectricity_Ex_3", "CurrentElectricity_Solutions"};
        this.EIName = new String[]{"Simple_ElectromagneticInduction_Ex_1", "Advanced_ElectromagneticInduction_Ex_2", "Yearwise_ElectromagneticInduction_Ex_3", "ElectromagneticInduction_Solutions"};
        this.EWName = new String[]{"Simple_ElectromagneticWave_Ex_1", "Advanced_ElectromagneticWave_Ex_2", "Yearwise_ElectromagneticWave_Ex_3", "ElectromagneticWave_Solutions"};
        this.ElectrostaticsName = new String[]{"Simple_Electrostatics_Ex_1", "Advanced_Electrostatics_Ex_2", "Yearwise_Electrostatics_Ex_3", "Electrostatics_Solutions"};
        this.FMName = new String[]{"Simple_FluidMechanics_ex_1", "Advanced_FluidMechanics_ex_2", "Yearwise_FluidMechanics_ex_3", "FluidMechanics_Solutions"};
        this.FrictionName = new String[]{"Simple_Friction_Ex_1", "Advanced_Friction_Ex_2", "Yearwise_Friction_Ex_3", "Friction_Solutions"};
        this.GOName = new String[]{"Simple_GeometricalOptics_Ex_1", "Advanced_GeometricalOptics_Ex_2", "Yearwise_GeometricalOptics_Ex_3", "GeometricalOptics_Solutions"};
        this.GravitationName = new String[]{"Simple_Gravitation_Ex_1", "Advanced_Gravitation_Ex_2", "Yearwise_Gravitation_Ex_3", "Gravitation_Solutions"};
        this.HTName = new String[]{"Simple_HeatTransfer_Ex_1", "Advanced_HeatTransfer_Ex_2", "Yearwise_HeatTransfer_Ex_3", "HeatTransfer_Solutions"};
        this.KTGName = new String[]{"Simple_KTG&Thermodynamics_Ex_1", "Advanced_KTG&Thermodynamics_Ex_2", "Yearwise_KTG&Thermodynamics_Ex_3", "KTG&Thermodynamics_Solutions"};
        this.MECName = new String[]{"Simple_MagneticEffectofCurrent_Ex_1", "Advanced_MagneticEffectofCurrent_Ex_2", "Yearwise_MagneticEffectofCurrent_Ex_3", "MagneticEffectofCurrent_Solutions"};
        this.MTName = new String[]{"Simple_MathematicalTools_Ex_1", "Advanced_MathematicalTools_Ex_2", "Yearwise_MathematicalTools_Ex_3", "MathematicalTools_Solutions"};
        this.MeasurementName = new String[]{"Simple_MeasurementError&Experiment_Ex_1", "Advanced_MeasurementError&Experiment_Ex_2", "Yearwise_MeasurementError&Experiment_Ex_3", "MeasurementError&Experiment_Solutions"};
        this.MPName = new String[]{"Simple_ModernPhysics_Ex_1", "Advanced_ModernPhysics_Ex_2", "Yearwise_ModernPhysics_Ex_3", "ModernPhysics_Solutions"};
        this.NLMName = new String[]{"Simple_NewtonsLawofMotion_Ex_1", "Advanced_NewtonsLawofMotion_Ex_2", "Yearwise_NewtonsLawofMotion_Ex_3", "NewtonsLawofMotion_Solutions"};
        this.NPName = new String[]{"Simple_NuclearPhysics_Ex_1", "Advanced_NuclearPhysics_Ex_2", "Yearwise_NuclearPhysics_Ex_3", "NuclearPhysics_Solutions"};
        this.POCName = new String[]{"Simple_PrincipleofCommunication_Ex_1", "Advanced_PrincipleofCommunication_Ex_2", "Yearwise_PrincipleofCommunication_Ex_3", "PrincipleofCommunication_Solutions"};
        this.PMName = new String[]{"Simple_ProjectileMotion_Ex_1", "Advanced_ProjectileMotion_Ex_2", "Yearwise_ProjectileMotion_Ex_3", "ProjectileMotion_Solutions"};
        this.RMName = new String[]{"Simple_RectilinearMotion_Ex_1", "Advanced_RectilinearMotion_Ex_2", "Yearwise_RectilinearMotion_Ex_3", "RectilinearMotion_Solutions"};
        this.RelativeMName = new String[]{"Simple_RelativeMotion_Ex_1", "Advanced_RelativeMotion_Ex_2", "Yearwise_RelativeMotion_Ex_3", "RelativeMotion_Solutions"};
        this.RBDName = new String[]{"Simple_RigidBodyDynamics_Ex_1", "Advanced_RigidBodyDynamics_Ex_2", "Yearwise_RigidBodyDynamics_Ex_3", "RigidBodyDynamics_Solutions"};
        this.SHMName = new String[]{"Simple_SimpleHarmonicMotion_Ex_1", "Advanced_SimpleHarmonicMotion_Ex_2", "Yearwise_SimpleHarmonicMotion_Ex_3", "SimpleHarmonicMotion_Solutions"};
        this.SSName = new String[]{"Simple_Solid&SemiconductorDevices_Ex_1", "Advanced_Solid&SemiconductorDevices_Ex_2", "Yearwise_Solid&SemiconductorDevices_Ex_3", "Solid&SemiconductorDevices_Solutions"};
        this.SWName = new String[]{"Simple_SoundWave_Ex_1", "Advanced_SoundWave_Ex_2", "Yearwise_SoundWave_Ex_3", "SoundWave_Solutions"};
        this.STName = new String[]{"Simple_SurfaceTension_Ex_1", "Advanced_SurfaceTension_Ex_2", "Yearwise_SurfaceTension_Ex_3", "SurfaceTension_Solutions"};
        this.UDName = new String[]{"Simple_Units&Dimension_Ex_1", "Advanced_Units&Dimension_Ex_2", "Yearwise_Units&Dimension_Ex_3", "Units&Dimension_Solutions"};
        this.WaveName = new String[]{"Simple_WaveOnaString_Ex_1", "Advanced_WaveOnaString_Ex_2", "Yearwise_WaveOnaString_Ex_3", "WaveOnaString_Solutions"};
        this.WOName = new String[]{"Simple_WaveOptics_Ex_1", "Advanced_WaveOptics_Ex_2", "Yearwise_WaveOptics_Ex_3", "WaveOptics_Solutions"};
        this.WPName = new String[]{"Simple_WorkPower&Energy_Ex_1", "Advanced_WorkPower&Energy_Ex_2", "Yearwise_WorkPower&Energy_Ex_3", "WorkPower&Energy_Solutions"};
        this.defaultName = new String[]{"Piyush Malviya"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_questions_view_pdf_files);
        this.ParentListItems = new LinkedHashMap();
        for (String str : this.ParentList) {
            if (str.equals("Sample Advanced Paid PDFs")) {
                loadChild(this.SamplePaidpdfName);
            } else if (str.equals("Paid PDFs")) {
                loadChild(this.PaidpdfName);
            } else if (str.equals("Alternating Current")) {
                loadChild(this.ACName);
            } else if (str.equals("Calorimetry & Thermal Expansion")) {
                loadChild(this.CaliorimetryName);
            } else if (str.equals("Capacitance")) {
                loadChild(this.CapacitanceName);
            } else if (str.equals("Center of Mass")) {
                loadChild(this.COMName);
            } else if (str.equals("Circular Motion")) {
                loadChild(this.CircularmotionName);
            } else if (str.equals("Current Electricity")) {
                loadChild(this.CurrentName);
            } else if (str.equals("Electromagnetic Induction")) {
                loadChild(this.EIName);
            } else if (str.equals("Electromagnetic Wave")) {
                loadChild(this.EWName);
            } else if (str.equals("Electrostatics")) {
                loadChild(this.ElectrostaticsName);
            } else if (str.equals("Fluid Mechanics")) {
                loadChild(this.FMName);
            } else if (str.equals("Friction")) {
                loadChild(this.FrictionName);
            } else if (str.equals("Geometrical Optics")) {
                loadChild(this.GOName);
            } else if (str.equals("Gravitation")) {
                loadChild(this.GravitationName);
            } else if (str.equals("Heat Transfer")) {
                loadChild(this.HTName);
            } else if (str.equals("KTG & Thermodynamics")) {
                loadChild(this.KTGName);
            } else if (str.equals("Magnetic Effect of Current")) {
                loadChild(this.MECName);
            } else if (str.equals("Mathematical Tools")) {
                loadChild(this.MTName);
            } else if (str.equals("Measurement Error & Experiment")) {
                loadChild(this.MeasurementName);
            } else if (str.equals("Modern Physics")) {
                loadChild(this.MPName);
            } else if (str.equals("Newtons Law of Motion")) {
                loadChild(this.NLMName);
            } else if (str.equals("Nuclear Physics")) {
                loadChild(this.NPName);
            } else if (str.equals("Principle Of Communication")) {
                loadChild(this.POCName);
            } else if (str.equals("Projectile Motion")) {
                loadChild(this.PMName);
            } else if (str.equals("Rectilinear Motion")) {
                loadChild(this.RMName);
            } else if (str.equals("Relative Motion")) {
                loadChild(this.RelativeMName);
            } else if (str.equals("Rigid Body Dynamics")) {
                loadChild(this.RBDName);
            } else if (str.equals("Simple Harmonic Motion")) {
                loadChild(this.SHMName);
            } else if (str.equals("Solid & Semiconductor Devices")) {
                loadChild(this.SSName);
            } else if (str.equals("Sound Wave")) {
                loadChild(this.SWName);
            } else if (str.equals("Surface Tension")) {
                loadChild(this.STName);
            } else if (str.equals("Units & Dimension")) {
                loadChild(this.UDName);
            } else if (str.equals("Wave on a String")) {
                loadChild(this.WaveName);
            } else if (str.equals("Wave Optics")) {
                loadChild(this.WOName);
            } else if (str.equals("Work Power & Energy")) {
                loadChild(this.WPName);
            } else {
                loadChild(this.defaultName);
            }
            this.ParentListItems.put(str, this.ChildList);
        }
        this.expandableListView = (ExpandableListView) findViewById(R.id.expandListView);
        final ListAdapter listAdapter = new ListAdapter(this, this.ParentList, this.ParentListItems);
        this.expandableListView.setAdapter(listAdapter);
        this.expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.pm161998.jeephysics.Questions_view_pdf_files.1
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                Intent intent = new Intent(Questions_view_pdf_files.this.getApplicationContext(), Questions_pdf_opener.class);
                intent.putExtra("pdfFileName", (String) listAdapter.getChild(i, i2));
                Questions_view_pdf_files.this.startActivity(intent);
                return true;
            }
        });
    }

    private void loadChild(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.ChildList = arrayList;
        Collections.addAll(arrayList, strArr);
    }
}
